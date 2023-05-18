package com.chernenkov.arrays.observer.impl;

import com.chernenkov.arrays.observer.ArrayObserver;
import com.chernenkov.arrays.entity.ArrayStatistics;
import com.chernenkov.arrays.entity.CustomArray;
import com.chernenkov.arrays.entity.Warehouse;

public class ArrayObserverImpl implements ArrayObserver {
    @Override
    public void handleEvent(CustomArray array) {
        ArrayStatistics statistics = new ArrayStatistics(array);
        int id = array.getArrayId();
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.put(id, statistics);
    }
}
