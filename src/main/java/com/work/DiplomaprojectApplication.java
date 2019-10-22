package com.work;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = {"com.work.diplomaproject.dao"})
@SpringBootApplication
public class DiplomaprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiplomaprojectApplication.class, args);
    }

}
