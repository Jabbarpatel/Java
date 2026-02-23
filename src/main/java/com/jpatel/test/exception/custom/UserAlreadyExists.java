package com.jpatel.test.exception.custom;

import com.jpatel.test.exception.AppException;

public class UserAlreadyExists extends AppException {

    public UserAlreadyExists() {
        super("user already exists", 404);
    }

}
