package com.webLab.entity.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminUpdatePasswordDto {
    private String username;

    private String newPassword;

    private String oldPassword;
}
