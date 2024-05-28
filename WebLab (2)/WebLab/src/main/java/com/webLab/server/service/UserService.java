package com.webLab.server.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.webLab.entity.pojo.dto.UserUpdateDto;
import com.webLab.entity.pojo.User;

public interface UserService {
    boolean addUser(User user);
    IPage findByPageAndParm(int pageNum, int pageSize, String name);
    boolean updateUser(User user);
    int selectUserId(UserUpdateDto userUpdateDto);
    boolean deleteUser(int id);
}
