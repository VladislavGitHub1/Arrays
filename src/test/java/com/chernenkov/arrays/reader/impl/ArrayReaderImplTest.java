package com.chernenkov.arrays.reader.impl;

import com.chernenkov.arrays.exception.CustomArrayException;
import com.chernenkov.arrays.reader.ArrayReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayReaderImplTest {
    ArrayReader arrayReader;

    @BeforeEach
    void setUp() {
        arrayReader = new ArrayReaderImpl();
    }

    @Test
    void readExistentFile() throws CustomArrayException {
        List<int[]> readedIntList = arrayReader.readArray("testArrays.txt");
        int expectedSize = 2;
        assertArrayEquals(new int[]{69, 1, 2, 5, 45, 77, 8}, readedIntList.get(1));
        assertEquals(expectedSize, readedIntList.size());

    }

    @Test
    void readNonExistentFile() throws CustomArrayException {
        List<int[]> readedIntList = arrayReader.readArray("non-existent");
        int expectedSize = 3;
        assertArrayEquals(new int[]{45, 8, 78, 56, 95, 4}, readedIntList.get(1));
        assertEquals(expectedSize, readedIntList.size());
    }
}