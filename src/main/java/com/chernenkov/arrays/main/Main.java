package com.chernenkov.arrays.main;

import com.chernenkov.arrays.entity.CustomArray;
import com.chernenkov.arrays.service.impl.CustomArrayServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        CustomArray array1 = new CustomArray(4, new int[]{1, 2, 3});
        logger.info(array1);
    }
}
