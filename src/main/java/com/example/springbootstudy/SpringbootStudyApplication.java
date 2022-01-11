package com.example.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootStudyApplication {

    public static void main(String[] args) {
        //web서버 기동 없이 실행
        SpringApplication springApplication = new SpringApplication(SpringbootStudyApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }

}
