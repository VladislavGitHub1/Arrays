package com.chernenkov.arrays.entity;

import java.util.Arrays;
import java.util.Objects;

public class CustomArray {
    private int[] array;
    private int arrayID;

    public CustomArray() {
    }

    public CustomArray(int[] array, int arrayID) {
        this.array = array;
        this.arrayID = arrayID;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getArrayID() {
        return arrayID;
    }

    public void setArrayID(int arrayID) {
        this.arrayID = arrayID;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "array=" + Arrays.toString(array) +
                ", arrayID=" + arrayID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return arrayID == that.arrayID && Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(arrayID);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
