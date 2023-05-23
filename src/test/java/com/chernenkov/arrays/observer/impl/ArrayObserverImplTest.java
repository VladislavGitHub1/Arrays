package com.chernenkov.arrays.observer.impl;

import com.chernenkov.arrays.entity.ArrayStatistics;
import com.chernenkov.arrays.entity.CustomArray;
import com.chernenkov.arrays.entity.Warehouse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ArrayObserverImplTest {
    ArrayObserverImpl arrayObserver;
    CustomArray customArray;
    @BeforeEach
    void setUp() {
        customArray = new CustomArray(45, new int[]{10, 20, 30});
        arrayObserver = new ArrayObserverImpl();
    }

    @Test
    void handleEventWithTestArray() {
        arrayObserver.handleEvent(customArray);
        Warehouse warehouse = Warehouse.getInstance();
        Map<Integer, ArrayStatistics> warehouseMap = warehouse.getWarehouseMap();
        ArrayStatistics arrayStatisticsTest = new ArrayStatistics(customArray);
        assertTrue(arrayStatisticsTest.equals( warehouseMap.get(45)));

    }
}