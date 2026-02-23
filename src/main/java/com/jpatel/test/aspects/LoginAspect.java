package com.jpatel.test.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import jakarta.servlet.http.HttpServletRequest;

@Aspect
@Component
public class LoginAspect {

    private final HttpServletRequest request;

    public LoginAspect(HttpServletRequest request) {
        this.request = request;
    }

    @Before("@annotation(com.jpatel.test.annotations.LoginRequired)")
    public void Login() {
        String token = request.getHeader("Authorization");
        if (token == null) {
            System.out.println("TOKEN NOT FOUND!");
            return;
        }
        String[] test = token.split(" ");
        System.out.println("TOKEN FOUND" + test[1]);
    }
}
