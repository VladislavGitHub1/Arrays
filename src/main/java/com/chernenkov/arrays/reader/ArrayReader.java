package com.chernenkov.arrays.reader;

import java.util.List;

public interface ArrayReader {
    public static final String DEFAULT_FILENAME = "data\\deafultArrays.txt";
    public static final String DEFAULT_DIRECTORY = "./data";
    public static final String SPACE_DELIMITER = "\\s+";
    List<int[]> readArray();
}
