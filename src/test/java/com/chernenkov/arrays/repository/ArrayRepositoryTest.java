package com.chernenkov.arrays.repository;

import com.chernenkov.arrays.entity.CustomArray;
import com.chernenkov.arrays.repository.specification.SpecifyArrayByAverage;
import com.chernenkov.arrays.repository.specification.SpecifyArrayById;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrayRepositoryTest {
    CustomArray customArray;
    CustomArray customArray2;

    List<CustomArray> customArrays;
    List<CustomArray> results;
    ArrayRepository arrayRepository;

    @BeforeEach
    void setUp() {
        customArray = new CustomArray(1, new int[]{10, 20, 30});
        customArray2 = new CustomArray(2, new int[]{20, 30, 40});
        customArrays = new ArrayList<>();
        customArrays.add(customArray);
        customArrays.add(customArray2);
        arrayRepository = new ArrayRepository(customArrays);
        results = new ArrayList<>();
    }

    @Test
    void queryIfSpecifyById() {
        SpecifyArrayById specifyArrayById = new SpecifyArrayById(1);
        List<CustomArray> results = arrayRepository.query(specifyArrayById);
        int expectedSize = 1;
        assertEquals(expectedSize, results.size());
        for (CustomArray array : results) {
            assertArrayEquals(customArray.getArray(), array.getArray());
        }
    }

    @Test
    void queryIfSpecifyByAverage() {
        SpecifyArrayByAverage specifyArrayByAverage = new SpecifyArrayByAverage(30);
        List<CustomArray> results = arrayRepository.query(specifyArrayByAverage);
        int expectedSize = 1;
        assertEquals(expectedSize, results.size());
        for (CustomArray array : results) {
            assertArrayEquals(customArray2.getArray(), array.getArray());
        }
    }
}
