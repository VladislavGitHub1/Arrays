package com.chernenkov.arrays.entity;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private static final Warehouse instance = new Warehouse();
    private Map<Integer, ArrayStatistics> warehouseMap = new HashMap<>();

    public static Warehouse getInstance(){
        return instance;
    }

    public ArrayStatistics put(Integer id, ArrayStatistics calculated) {
        return warehouseMap.put(id, calculated);
    }

    public ArrayStatistics remove(Integer id){
        return warehouseMap.remove(id);
        }
    public ArrayStatistics replace(Integer id, ArrayStatistics calculated){
        return warehouseMap.replace(id, calculated);
    }

    public Map<Integer, ArrayStatistics> getWarehouseMap(){
        return warehouseMap;
    }
}
