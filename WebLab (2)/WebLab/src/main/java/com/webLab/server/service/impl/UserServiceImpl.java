package com.webLab.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.webLab.entity.pojo.dto.UserUpdateDto;
import com.webLab.entity.pojo.User;
import com.webLab.server.mapper.UserMapper;
import com.webLab.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public boolean addUser(User user) {
        return userMapper.insert(user) > 0;
    }

    public IPage findByPageAndParm(int pageNum, int pageSize, String name) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();

        wrapper.lambda()
                .like(name != null, User::getName, name);

        // 创建分页对象
        Page<User> page = new Page<>(pageNum, pageSize);

        // 执行分页查询
        return userMapper.selectPage(page, wrapper);
    }

    public boolean updateUser(User user) {
        //对象属性拷贝
        return userMapper.updateById(user) > 0;
    }

    public boolean deleteUser(int id) {
        return userMapper.deleteById(id) > 0;
    }

    public int selectUserId(UserUpdateDto userUpdateDto) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", userUpdateDto.getName());
        User user = userMapper.selectOne(queryWrapper);
        return user.getId();
    }


}
