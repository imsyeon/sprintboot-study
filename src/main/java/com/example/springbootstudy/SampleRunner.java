package com.example.springbootstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class SampleRunner implements ApplicationRunner {

    @Autowired
    SueProperties sueProperties;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("--------------");
        System.out.println(sueProperties.getName());
        System.out.println(sueProperties.getAge());
        System.out.println("===============");
    }
}
