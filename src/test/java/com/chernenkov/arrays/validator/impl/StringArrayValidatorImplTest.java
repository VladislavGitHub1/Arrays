package com.chernenkov.arrays.validator.impl;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringArrayValidatorImplTest {

    StringArrayValidatorImpl stringArrayValidator = new StringArrayValidatorImpl();

    @Test
    void stringArrayValidate() {
        String validLine = "12 45 7 8 56 2";
        String invalidLine = "1 21 f 25d 3";
        assertTrue(stringArrayValidator.stringArrayValidate(validLine));
        assertFalse(stringArrayValidator.stringArrayValidate(invalidLine));

    }
}