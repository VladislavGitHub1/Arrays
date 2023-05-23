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
    CustomArray customArray = new CustomArray(1, new int[]{10, 20, 30});
    CustomArray customArray2 = new CustomArray(2, new int[]{20, 30, 40});

    List<CustomArray> customArrays;
    List<CustomArray> results = new ArrayList<>();

    @BeforeEach
    void setUp() {
        customArrays = new ArrayList<>();
        customArrays.add(customArray);
        customArrays.add(customArray2);
    }

    @Test
    void queryIfSpecifyById() {
        SpecifyArrayById specifyArrayById = new SpecifyArrayById(1);
        if (specifyArrayById.specify(customArray)) {
            results.add(customArray);
        }
        ;
        if (specifyArrayById.specify(customArray2)) {
            results.add(customArray2);
        }
        ;
        int expectedSize = 1;
        assertEquals(expectedSize, results.size());
        for (CustomArray array : results) {
            assertArrayEquals(array.getArray(), customArray.getArray());
        }
    }

    @Test
    void queryIfSpecifyByAverage() {
        SpecifyArrayByAverage specifyArrayByAverage = new SpecifyArrayByAverage(30);
        for (CustomArray array : customArrays) {
            if (specifyArrayByAverage.specify(array)) {
                results.add(array);
            }
        }
        int expectedSize = 1;
        assertEquals(expectedSize, results.size());
        for (CustomArray array : results) {
            assertArrayEquals(array.getArray(), customArray2.getArray());
        }

    }
    @AfterEach
    void clearResults() {
        results.clear();
    }
}