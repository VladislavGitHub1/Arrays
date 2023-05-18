package com.chernenkov.arrays.validator;

public interface StringArrayValidator {
    public static final String INT_ARRAY_REGEX = "([0-9]{1,3}\\s+)+(\\d{1,3})";
    boolean stringArrayValidate(String stringArray);
}
