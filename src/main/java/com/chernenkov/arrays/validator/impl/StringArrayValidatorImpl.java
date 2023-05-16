package com.chernenkov.arrays.validator.impl;

import com.chernenkov.arrays.validator.StringArrayValidator;

public class StringArrayValidatorImpl implements StringArrayValidator {
    private static final String INT_ARRAY_REGEX = "([0-9]{1,3}\\s+)+(\\d{1,3})";

    public boolean stringArrayValidate(String stringArray) {
        return stringArray.matches(INT_ARRAY_REGEX);
    }
}