package com.example.liumybatisplus;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.liumybatisplus.mapper")
public class LiumybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiumybatisplusApplication.class, args);
    }

}
