package com.jpatel.test.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpatel.test.annotations.LoginRequired;
import com.jpatel.test.dto.users.SignInRequest;
import com.jpatel.test.entity.UserEntity;
import com.jpatel.test.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    @LoginRequired
    @GetMapping("/getusers")
    public ResponseEntity<List<UserEntity>> Test() {
        List<UserEntity> users = userService.getAllUsers();
        return ResponseEntity.status(200).body(users);
    }

    @LoginRequired
    @PostMapping("/signIn")
    public ResponseEntity<String> postMethodName(@RequestBody SignInRequest request) {
        String name = request.name;
        String password = request.password;
        String role = request.role;
        userService.handleSignIn(name, password);
        return ResponseEntity.status(200).body("success");
    }
}
