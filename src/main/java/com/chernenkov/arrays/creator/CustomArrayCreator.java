package com.chernenkov.arrays.creator;

import com.chernenkov.arrays.entity.CustomArray;
import com.chernenkov.arrays.util.IDGenerator;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayCreator {


    public static CustomArray createCustomArray(int[] array, int arrayId){
        CustomArray customArray = new CustomArray(array, arrayId);
        return customArray;
    }
    public static List<CustomArray> createCustomArray(List<int[]> arrayStringList){
        List<CustomArray> customArrays = new ArrayList<>();
        for (int[] array : arrayStringList){
                CustomArray customArray = new CustomArray(array, IDGenerator.generateID());
                customArrays.add(customArray);
        }
        return customArrays;
    }
}
