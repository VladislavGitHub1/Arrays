package com.chernenkov.arrays.creator;

import com.chernenkov.arrays.entity.CustomArray;
import com.chernenkov.arrays.util.IdGenerator;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayFactory {


    public static CustomArray createCustomArray(int arrayId, int[] array){
        CustomArray customArray = new CustomArray(arrayId, array);
        return customArray;
    }
    public static List<CustomArray> createCustomArray(List<int[]> arrayStringList){
        List<CustomArray> customArrays = new ArrayList<>();
        for (int[] array : arrayStringList){
                CustomArray customArray = new CustomArray(IdGenerator.generateID(), array);
                customArrays.add(customArray);
        }
        return customArrays;
    }
}
