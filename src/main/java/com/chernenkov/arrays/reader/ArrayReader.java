package com.chernenkov.arrays.reader;

import com.chernenkov.arrays.exception.CustomArrayException;

import java.util.List;

public interface ArrayReader {
    public static final String DEFAULT_FILENAME = "data\\deafultArrays.txt";
    public static final String DEFAULT_DIRECTORY = "./data";
    public static final String SPACE_DELIMITER = "\\s+";
    List<int[]> readArray(String fileName) throws CustomArrayException;
}
