package com.webLab.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.webLab.entity.pojo.dto.AdminLoginDto;
import com.webLab.entity.pojo.dto.AdminUpdatePasswordDto;
import com.webLab.entity.pojo.Admin;
import com.webLab.server.mapper.AdminMapper;
import com.webLab.server.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public boolean addAdmin(Admin admin) {
        LambdaQueryWrapper<Admin> wrapper = new LambdaQueryWrapper<Admin>();
        wrapper.eq(Admin::getUsername, admin.getUsername());
        if (adminMapper.exists(wrapper)) {  //如果存在相同的id
            return false;
        } else {  //不存在相同id则插入该用户
            adminMapper.insert(admin);
            return true;
        }
    }


    public boolean isExist(AdminLoginDto adminLoginDto) {
        LambdaQueryWrapper<Admin> wrapper = new LambdaQueryWrapper<Admin>();
        wrapper.eq(Admin::getUsername, adminLoginDto.getUsername());
        wrapper.and(i -> i.eq(Admin::getPassword, adminLoginDto.getPassword()));
        return adminMapper.exists(wrapper);
    }

    public boolean updateAdmin(AdminUpdatePasswordDto adminUpdatePasswordDto) {
        Admin newAdmin = adminMapper.findByUsernameAndPassword(adminUpdatePasswordDto.getUsername(), adminUpdatePasswordDto.getOldPassword());
        if(newAdmin == null){
            return false;
        }
        int updateRow = adminMapper.updatePassword(adminUpdatePasswordDto.getUsername(),adminUpdatePasswordDto.getNewPassword());
        return updateRow > 0;
    }

    public int countAdmins() {
        return adminMapper.countAdmins();
    }

    public Admin selectByUsername(String username){
        QueryWrapper<Admin> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        Admin admin = adminMapper.selectOne(queryWrapper);
        return admin;
    };

}
