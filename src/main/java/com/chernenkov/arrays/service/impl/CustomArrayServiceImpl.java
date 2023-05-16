package com.chernenkov.arrays.service.impl;

import com.chernenkov.arrays.entity.CustomArray;
import com.chernenkov.arrays.service.CustomArrayService;

public class CustomArrayServiceImpl implements CustomArrayService {
    @Override
    public int findMinValue(CustomArray customArray) {
        int [] arr = customArray.getArray();
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];}
        }
        return min;
    }

    @Override
    public int findMaxValue(CustomArray customArray) {
        int [] arr = customArray.getArray();
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];}
        }
        return max;
    }

    @Override
    public float calculateSum(CustomArray customArray) {
        int [] arr = customArray.getArray();
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    @Override
    public float calculateAverageValue(CustomArray customArray) {
        int [] arr = customArray.getArray();
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    @Override
    public int countPositiveValues(CustomArray customArray) {
        int [] arr = customArray.getArray();
        int positive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                positive += 1;}
        }
        return positive;
    }

    @Override
    public int countNegativeValues(CustomArray customArray) {
        int [] arr = customArray.getArray();
        int negative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                negative += 1;}
        }
        return negative;
    }

    @Override
    public int countZeroValues(CustomArray customArray) {
        int [] arr = customArray.getArray();
        int zeroValues = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                zeroValues += 1;}
        }
        return zeroValues;
    }
}

