package com.webLab.server.service;

import com.webLab.entity.pojo.dto.AdminLoginDto;
import com.webLab.entity.pojo.dto.AdminUpdatePasswordDto;
import com.webLab.entity.pojo.Admin;

public interface AdminService {
    boolean addAdmin(Admin admin);
    boolean isExist(AdminLoginDto adminLoginDto);
    boolean updateAdmin(AdminUpdatePasswordDto adminUpdatePasswordDto);
    int countAdmins();
    Admin selectByUsername(String username);
}
