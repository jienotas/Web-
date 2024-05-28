package com.webLab.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Admin {

    @TableId(type = IdType.AUTO)
    private int id;

    private String username;

    private String password;

    private String email;

    private LocalDate dateOfBirth;

}
