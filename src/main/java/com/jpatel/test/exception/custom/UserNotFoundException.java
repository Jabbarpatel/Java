package com.jpatel.test.exception.custom;

import com.jpatel.test.exception.AppException;

public class UserNotFoundException extends AppException {

    public UserNotFoundException() {
        super("user not found", 404);
    }
}
