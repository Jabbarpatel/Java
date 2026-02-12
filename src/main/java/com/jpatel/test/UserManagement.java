package com.jpatel.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserManagement {

    public static void main(String[] args) {
        System.out.println("Spring app is started!");
        SpringApplication.run(UserManagement.class, args);
    }
}
