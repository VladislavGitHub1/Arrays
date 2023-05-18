package com.chernenkov.arrays.repository;

import com.chernenkov.arrays.entity.CustomArray;

import java.util.List;

public class ArrayRepository{
    private List<CustomArray> customArrayRepository;

    public ArrayRepository(List<CustomArray> customArrayRepository) {
        this.customArrayRepository = customArrayRepository;
    }

    public boolean addToRepository(List<CustomArray> customArrays){
        boolean a = false;
        for (CustomArray customArray : customArrays){
            customArrayRepository.add(customArray);
        }
        return a;
    }
    public boolean addToRepository(CustomArray customArray){
        boolean a = false;
        customArrayRepository.add(customArray);
        return a;
    }

    public List<CustomArray> queryStream(Specification specification) {
        return customArrayRepository.stream().filter(array -> specification.specify(array)).toList();
    }
}
