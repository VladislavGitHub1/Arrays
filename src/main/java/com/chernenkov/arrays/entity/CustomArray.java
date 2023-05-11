package com.chernenkov.arrays.entity;

import java.util.Arrays;
import java.util.Objects;

public class CustomArray {
    private int arrayId;
    private int[] array;
    public CustomArray(int[] array, int arrayId) {
        this.array = array;
        this.arrayId = arrayId;
    }

    public CustomArray() {
    }


    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getArrayId() {
        return arrayId;
    }

    public void setArrayId(int arrayId) {
        this.arrayId = arrayId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return arrayId == that.arrayId && Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(arrayId);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "arrayId=" + arrayId +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
