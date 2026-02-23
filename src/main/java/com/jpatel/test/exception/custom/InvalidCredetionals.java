package com.jpatel.test.exception.custom;

import com.jpatel.test.exception.AppException;

public class InvalidCredetionals extends AppException {

    public InvalidCredetionals() {
        super("invalid credetionals", 404);
    }

}
