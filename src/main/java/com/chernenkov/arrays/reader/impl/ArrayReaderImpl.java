package com.chernenkov.arrays.reader.impl;

import com.chernenkov.arrays.exception.CustomArrayException;
import com.chernenkov.arrays.reader.ArrayReader;
import com.chernenkov.arrays.validator.impl.StringArrayValidatorImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static com.chernenkov.arrays.reader.ArrayReader.*;

public class ArrayReaderImpl implements ArrayReader {
    static Logger logger = LogManager.getLogger();

    public List<int[]> readArray(String fileName) throws CustomArrayException {
        int[] result = new int[0];
        File file = null;
        File directory = new File(DEFAULT_DIRECTORY);
        file = new File(directory,fileName);
        if (!file.exists()){
            logger.warn("File " + fileName + " is not exists");
            file = new File(DEFAULT_FILENAME);
        }
        List<int[]> arraysIntList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {;
            String line;
            StringArrayValidatorImpl validator = new StringArrayValidatorImpl();
            while ((line = br.readLine())!= null){
                if (validator.stringArrayValidate(line)){
                    String[] str = line.split(SPACE_DELIMITER);
                    result = new int[str.length];
                    for (int i=0; i<str.length; i++){
                        result[i] = Integer.parseInt(str[i]);
                    }
                    arraysIntList.add(result);
                }
            }
        } catch (IOException e) {
            throw new CustomArrayException(e);
        }
        return arraysIntList;
    }
}