package com.webLab.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.webLab.entity.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AdminMapper extends BaseMapper<Admin> {
    @Select("SELECT * FROM admin WHERE username = #{username} AND password = #{password}")
    Admin findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Update("UPDATE admin SET password = #{newPassword} WHERE username = #{username}")
    int updatePassword(@Param("username") String username, @Param("newPassword") String newPassword);

    @Select("SELECT COUNT(*) FROM admin")
    int countAdmins();

}
