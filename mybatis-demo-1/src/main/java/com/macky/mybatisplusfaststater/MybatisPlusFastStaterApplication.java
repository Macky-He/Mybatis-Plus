package com.macky.mybatisplusfaststater;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.macky.mybatisplusfaststater.mapper")
public class MybatisPlusFastStaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusFastStaterApplication.class, args);
    }

}
