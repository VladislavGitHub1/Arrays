package com.chernenkov.arrays.service.impl;

import com.chernenkov.arrays.service.CustomArrayService;

public class CustomArrayServiceImpl implements CustomArrayService {
    @Override
    public int findMinValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    @Override
    public int findMaxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    @Override
    public float calculateSum(int[] arr) {
        float summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        return summ;
    }

    @Override
    public float calculateAverageValue(int[] arr) {
        float summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
        }
        float average = summ / arr.length;
        return average;
    }

    @Override
    public int countPositiveValues(int[] arr) {
        int positive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                positive += 1;
        }
        return positive;
    }

    @Override
    public int countNegativeValues(int[] arr) {
        int negative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                negative += 1;
        }
        return negative;
    }

    @Override
    public int countZeroValues(int[] arr) {
        int zeroValues = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zeroValues += 1;
        }
        return zeroValues;
    }
}

