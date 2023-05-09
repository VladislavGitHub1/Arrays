package com.chernenkov.arrays.creator;

import com.chernenkov.arrays.entity.CustomArray;
import com.chernenkov.arrays.repository.ArrayRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayCreator {
    public static CustomArray createCustomArray(int[] array){
        CustomArray customArray = new CustomArray(array);
        return customArray;
    }
    public static List<CustomArray> createCustomArray(List<int[]> arrayStringList){
        List<CustomArray> customArrays = new ArrayList<>();
        for (int[] array : arrayStringList){
                CustomArray customArray = new CustomArray(array);
                customArrays.add(customArray);
        }
        return customArrays;
    }
}
