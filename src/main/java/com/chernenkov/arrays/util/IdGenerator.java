package com.chernenkov.arrays.util;

public class IdGenerator {
    private int id = 0;
    public int generateId(){
        id++;
        return id;
    }

}
