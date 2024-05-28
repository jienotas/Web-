package com.webLab.server.controller;

import com.webLab.common.constant.MessageConstant;
import com.webLab.common.result.Result;
import com.webLab.entity.pojo.dto.AdminLoginDto;
import com.webLab.entity.pojo.dto.AdminUpdatePasswordDto;
import com.webLab.entity.pojo.Admin;
import com.webLab.server.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    //用户注册

    //    @RequestParam("image") MultipartFile image
    @PostMapping("/register")
    public Result addAdmin(@RequestBody Admin admin) throws IOException {

        if (adminService.addAdmin(admin)) {
//            String uploadsDir = "/com/webLab/uploadDir/";
//            // 获取文件后缀
//            String originalFilename = image.getOriginalFilename();
//            String fileExtension = originalFilename.substring(originalFilename.lastIndexOf("."));
//            int adminId = adminService.countAdmins() + 1 ;
//            // 使用管理员ID作为文件名
//            String filename = String.valueOf(adminId) + fileExtension;
//
//            // 保存图片到本地文件系统，使用管理员ID作为文件名
//            String filepath = uploadsDir + filename;
//            File dest = new File(filepath);
//            image.transferTo(dest);

            return Result.success();
        } else {
            return Result.error(MessageConstant.ADMIN_REGISTER_FALSE);
        }
    }

    //用户登录
    @PostMapping("/login")
    public Result login(@RequestBody AdminLoginDto adminLoginDto) {

        if (adminService.isExist(adminLoginDto)) {
            return Result.success();
        } else {
            return Result.error(MessageConstant.ADMIN_LOGIN_FALSE);
        }
    }


    @PostMapping("/update")
    public Result updateAdminPassWord(@RequestBody AdminUpdatePasswordDto adminUpdatePasswordDto) {

        if (adminService.updateAdmin(adminUpdatePasswordDto)) {
            return Result.success();
        } else {
            return Result.error(MessageConstant.ADMIN_UPDATE_FALSE);
        }
    }

    @GetMapping("select")
    public Result selectAdmin(@RequestParam String username) {
        Admin admin = adminService.selectByUsername(username);
        if (admin != null ) {
            return Result.success(admin);
        } else {
            return Result.error(MessageConstant.ADMIN_UPDATE_FALSE);
        }
    }

    /*@PostMapping("/upload")
    public Result addAdmin(@RequestBody Admin admin) throws IOException {

//        if (adminService.addAdmin(admin)) {
////            String uploadsDir = "/com/webLab/uploadDir/";
////            // 获取文件后缀
////            String originalFilename = image.getOriginalFilename();
////            String fileExtension = originalFilename.substring(originalFilename.lastIndexOf("."));
////            int adminId = adminService.countAdmins() + 1 ;
////            // 使用管理员ID作为文件名
////            String filename = String.valueOf(adminId) + fileExtension;
////
////            // 保存图片到本地文件系统，使用管理员ID作为文件名
////            String filepath = uploadsDir + filename;
////            File dest = new File(filepath);
////            image.transferTo(dest);

            return Result.success();
        }*/
    }

