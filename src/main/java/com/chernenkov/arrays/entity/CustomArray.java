package com.chernenkov.arrays.entity;

import com.chernenkov.arrays.observer.impl.ArrayObserverImpl;

import java.util.Arrays;
import java.util.Objects;

public class CustomArray {
    private int arrayId;
    private int[] array;
    private ArrayObserverImpl observer;
    public CustomArray(int[] array, int arrayId) {
        this.array = array;
        this.arrayId = arrayId;
        observer = new ArrayObserverImpl();
        notifyObserver();
    }

    public CustomArray() {
    }


    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
        notifyObserver();
    }

    public int getArrayId() {
        return arrayId;
    }

    public void setArrayId(int arrayId) {
        this.arrayId = arrayId;
        notifyObserver();
    }

    public void notifyObserver(){
        if (observer != null){
            observer.handleEvent(this);
        }
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
        final StringBuilder sb = new StringBuilder("CustomArray{");
        sb.append("arrayId=").append(arrayId);
        sb.append(", array=").append(Arrays.toString(array));
        sb.append(", observer=").append(observer);
        sb.append('}');
        return sb.toString();
    }
}
