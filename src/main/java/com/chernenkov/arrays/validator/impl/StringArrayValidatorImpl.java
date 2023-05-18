package com.chernenkov.arrays.validator.impl;

import com.chernenkov.arrays.validator.StringArrayValidator;

public class StringArrayValidatorImpl implements StringArrayValidator {

    public boolean stringArrayValidate(String stringArray) {
        return stringArray.matches(INT_ARRAY_REGEX);
    }
}