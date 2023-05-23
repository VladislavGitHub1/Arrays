package com.chernenkov.arrays.repository.specification;

import com.chernenkov.arrays.entity.CustomArray;
import com.chernenkov.arrays.repository.Specification;
import com.chernenkov.arrays.service.impl.CustomArrayServiceImpl;

public class SpecifyArrayById implements Specification {
    private int id;

    public SpecifyArrayById(int id) {
        this.id = id;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        int gettedId = customArray.getArrayId();
        return gettedId == id;
    }
}
