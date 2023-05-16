package com.chernenkov.arrays.entity;

import com.chernenkov.arrays.service.CustomArrayService;
import com.chernenkov.arrays.service.impl.CustomArrayServiceImpl;

import java.util.Objects;

public class ArrayStatistics {
    private int min;
    private int max;
    private float sum;
    private float averageValue;
    private int negativeValues;
    private int positiveValues;
    private int zeroValues;

    public ArrayStatistics(CustomArray array) {
        CustomArrayServiceImpl service = new CustomArrayServiceImpl();
       this.min = service.findMinValue(array);
       this.max = service.findMaxValue(array);
       this.sum = service.calculateSum(array);
       this.averageValue = service.calculateAverageValue(array);
       this.negativeValues = service.countNegativeValues(array);
       this.positiveValues = service.countPositiveValues(array);
       this.zeroValues = service.countZeroValues(array);

    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public float getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(float averageValue) {
        this.averageValue = averageValue;
    }

    public int getNegativeValues() {
        return negativeValues;
    }

    public void setNegativeValues(int negativeValues) {
        this.negativeValues = negativeValues;
    }

    public int getPositiveValues() {
        return positiveValues;
    }

    public void setPositiveValues(int positiveValues) {
        this.positiveValues = positiveValues;
    }

    public int getZeroValues() {
        return zeroValues;
    }

    public void setZeroValues(int zeroValues) {
        this.zeroValues = zeroValues;
    }

    @Override
    public String toString() {
        return "ArrayStatistics{" +
                "min=" + min +
                ", max=" + max +
                ", sum=" + sum +
                ", averageValue=" + averageValue +
                ", negativeValues=" + negativeValues +
                ", positiveValues=" + positiveValues +
                ", zeroValues=" + zeroValues +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayStatistics that = (ArrayStatistics) o;
        return min == that.min && max == that.max && sum == that.sum && averageValue == that.averageValue && negativeValues == that.negativeValues && positiveValues == that.positiveValues && zeroValues == that.zeroValues;
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max, sum, averageValue, negativeValues, positiveValues, zeroValues);
    }
}
