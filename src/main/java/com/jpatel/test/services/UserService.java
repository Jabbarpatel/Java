package com.jpatel.test.services;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jpatel.test.entity.UserEntity;
import com.jpatel.test.exception.custom.InvalidCredetionals;
import com.jpatel.test.exception.custom.UserNotFoundException;
import com.jpatel.test.repositories.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void handleLogin(String name, String password) {
        UserEntity user = userRepository.findByName(name);
        if (user == null) {
            throw new UserNotFoundException();
        }
        boolean isPasswordMatch = passwordEncoder.matches(password, user.getPassword());
        if (!isPasswordMatch) {
            throw new InvalidCredetionals();
        }

    }

    public void handleSignIn(String name, String password) {
        String hashedPassword = passwordEncoder.encode(password);
        System.out.println(hashedPassword);
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}
