package com.chernenkov.arrays.repository.specification;

import com.chernenkov.arrays.entity.CustomArray;
import com.chernenkov.arrays.repository.Specification;
import com.chernenkov.arrays.service.impl.CustomArrayServiceImpl;

public class SpecifyArrayByAverage implements Specification {
    private int averageArrayValue;
    CustomArrayServiceImpl service = new CustomArrayServiceImpl();
    public SpecifyArrayByAverage(int averageArrayValue) {
        this.averageArrayValue = averageArrayValue;
    }

    @Override
    public boolean specify(CustomArray customArray) {
        float averageCalculated = (int)service.calculateAverageValue(customArray);
        return averageCalculated == averageArrayValue;
    }
}
