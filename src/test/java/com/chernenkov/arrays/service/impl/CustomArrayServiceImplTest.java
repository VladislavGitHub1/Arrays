package com.chernenkov.arrays.service.impl;

import com.chernenkov.arrays.entity.CustomArray;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CustomArrayServiceImplTest {
    private final int[] testArr = new int[]{0, 5, 3, -4, 10};
    private final CustomArray testArray = new CustomArray(2, testArr);
    CustomArrayServiceImpl service;

    @BeforeEach
    public void setUp() {
        service = new CustomArrayServiceImpl();
    }

    @Test
    void findMinValue() {
        int expected = -4;
        int result = service.findMinValue(testArray);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void findMaxValue() {
        int expected = 10;
        int result = service.findMaxValue(testArray);
        assertEquals(expected, result);
    }

    @Test
    void calculateSum() {
        float expected = 14;
        float result = service.calculateSum(testArray);
        assertEquals(expected, result, 3);
    }

    @Test
    void calculateAverageValue() {
        float expected = 2.8f;
        float result = service.calculateAverageValue(testArray);
        assertEquals(expected, result, 3);
    }

    @Test
    void countPositiveValues() {
        int expected = 3;
        int result = service.countPositiveValues(testArray);
        assertEquals(expected, result);
    }

    @Test
    void countNegativeValues() {
        int expected = 1;
        int result = service.countNegativeValues(testArray);
        assertEquals(expected, result);
    }

    @Test
    void countZeroValues() {
        int expected = 1;
        int result = service.countZeroValues(testArray);
        assertEquals(expected, result);
    }
}