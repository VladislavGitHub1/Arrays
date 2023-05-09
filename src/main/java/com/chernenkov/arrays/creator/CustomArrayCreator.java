package com.chernenkov.arrays.creator;

import com.chernenkov.arrays.entity.CustomArray;
import com.chernenkov.arrays.repository.ArrayRepository;
import com.chernenkov.arrays.util.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayCreator {


    public static CustomArray createCustomArray(int[] array, int arrayId){
        CustomArray customArray = new CustomArray(array, arrayId);
        return customArray;
    }
    public static List<CustomArray> createCustomArray(List<int[]> arrayStringList){
        IdGenerator idGenerator = new IdGenerator();
        List<CustomArray> customArrays = new ArrayList<>();
        for (int[] array : arrayStringList){
                CustomArray customArray = new CustomArray(array,idGenerator.generateId());
                customArrays.add(customArray);
        }
        return customArrays;
    }
}
