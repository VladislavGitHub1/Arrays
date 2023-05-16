package com.chernenkov.arrays.util;

public class IdGenerator {
    private static int id = 0;
    public static int generateID(){
        return ++id;
    }


}
