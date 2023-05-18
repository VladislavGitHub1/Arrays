package com.chernenkov.arrays.main;

import com.chernenkov.arrays.creator.CustomArrayFactory;
import com.chernenkov.arrays.entity.CustomArray;
import com.chernenkov.arrays.entity.Warehouse;
import com.chernenkov.arrays.exception.CustomArrayException;
import com.chernenkov.arrays.reader.impl.ArrayReaderImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) throws CustomArrayException {
        ArrayReaderImpl reader = new ArrayReaderImpl();
        List<CustomArray> firstArrays = new ArrayList<>();
        firstArrays = CustomArrayFactory.createCustomArray(reader.readArray("arrays.txt"));
        logger.info (firstArrays.toString());
        Warehouse test = Warehouse.getInstance();
        logger.info(test.getWarehouseMap());
        int[] arr = new int[]{-2,0,1};
        firstArrays.get(1).setArray(arr);
        logger.info(test.getWarehouseMap());
    }
}
