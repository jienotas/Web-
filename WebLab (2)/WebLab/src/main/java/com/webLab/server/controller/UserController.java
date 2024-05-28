package com.webLab.server.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.webLab.common.constant.MessageConstant;
import com.webLab.common.result.Result;
import com.webLab.entity.pojo.User;
import com.webLab.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //用户注册
    @PostMapping("/add")
    public Result addUser(@RequestBody User user) {

        if (userService.addUser(user)) {
            return Result.success();
        } else {
            return Result.error(MessageConstant.USER_ADD_FALSE);
        }
    }

    @GetMapping
    public Result<IPage> getAreas(@RequestParam int pageNum,
                                  @RequestParam int pageSize,
                                  @RequestParam String name) {
        IPage iPage = userService.findByPageAndParm(pageNum, pageSize, name);
        return Result.success(iPage);
    }

    @PutMapping
    public Result updateUser(@RequestBody User user) {
        if (userService.updateUser(user)) {
            return Result.success();
        } else {
            return Result.error(MessageConstant.USER_UPDATE_FALSE);
        }
    }

    @DeleteMapping
    public Result deleteUser(int id) {
        if (userService.deleteUser(id)) {
            return Result.success();
        } else {
            return Result.error(MessageConstant.USER_DELETE_FALSE);
        }
    }

}
