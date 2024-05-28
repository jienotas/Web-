package com.webLab;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.webLab.server.mapper")
public class WebLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebLabApplication.class, args);
    }

}
