package com.le.tmall_springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan
public class TmallSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmallSpringbootApplication.class, args);
    }

}
