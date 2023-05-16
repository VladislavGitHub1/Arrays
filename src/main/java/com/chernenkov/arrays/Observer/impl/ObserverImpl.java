package com.chernenkov.arrays.Observer.impl;

import com.chernenkov.arrays.Observer.Observer;
import com.chernenkov.arrays.entity.ArrayStatistics;
import com.chernenkov.arrays.entity.CustomArray;
import com.chernenkov.arrays.entity.Warehouse;

public class ObserverImpl implements Observer {
    @Override
    public void handleEvent(CustomArray array) {
        ArrayStatistics statistics = new ArrayStatistics(array);
        int id = array.getArrayId();
        Warehouse warehouse = Warehouse.getInstance();
        warehouse.put(id, statistics);
    }
}
