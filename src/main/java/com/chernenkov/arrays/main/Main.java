package com.chernenkov.arrays.main;

import com.chernenkov.arrays.creator.CustomArrayCreator;
import com.chernenkov.arrays.entity.CustomArray;
import com.chernenkov.arrays.exceprion.CustomException;
import com.chernenkov.arrays.reader.impl.ReaderImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) throws CustomException {
        ReaderImpl reader = new ReaderImpl();
        List<CustomArray> firstArrays = new ArrayList<>();
        firstArrays = CustomArrayCreator.createCustomArray(reader.readArray());
        logger.info (firstArrays.toString());
    }
}
