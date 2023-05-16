package com.chernenkov.arrays.service;

import com.chernenkov.arrays.entity.CustomArray;

public interface CustomArrayService {
    int findMinValue (CustomArray customArray);
    int findMaxValue (CustomArray customArray);
    float calculateSum (CustomArray customArray);
    float calculateAverageValue (CustomArray customArray);
    int countPositiveValues (CustomArray customArray);
    int countNegativeValues (CustomArray customArray);
    int countZeroValues (CustomArray customArray);
}
