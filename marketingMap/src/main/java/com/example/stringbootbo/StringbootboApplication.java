package com.example.stringbootbo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.example.stringbootbo.mapper")
public class StringbootboApplication {

    public static void main(String[] args) {
        SpringApplication.run(StringbootboApplication.class, args);
    }
}
