package com.webLab.entity.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateDto {
    private LocalDateTime date;

    private String name;

    private String province;

    private String city;

    private String address;

    private String postalCode;
}
