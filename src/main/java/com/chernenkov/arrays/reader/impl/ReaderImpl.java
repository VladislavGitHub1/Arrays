package com.chernenkov.arrays.reader.impl;

import com.chernenkov.arrays.exception.CustomArrayException;
import com.chernenkov.arrays.validator.impl.StringArrayValidatorImpl;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ReaderImpl{
    private static final String DEFAULT_FILENAME = "data\\deafultArrays.txt";

    public List<int[]> readArray() throws CustomArrayException {
        int[] result = new int[0];
        BufferedReader br = null;
        File file = null;
        File directory = new File("./data");
        file = new File(directory,"arrays.txt");
        if (!file.exists()){
            System.out.println("File is not exists");
            file = new File(DEFAULT_FILENAME);
        }
        List<int[]> arraysIntList = new ArrayList<>();
        try {br = new BufferedReader(new FileReader(file));
            String line;
            StringArrayValidatorImpl validator = new StringArrayValidatorImpl();
            while ((line = br.readLine())!= null){
                if (validator.stringArrayValidate(line)){
                    String[] str = line.split("\\s+");
                    result = new int[str.length];
                    for (int i=0; i<str.length; i++){
                        result[i] = Integer.parseInt(str[i]);
                    }
                    arraysIntList.add(result);
                }
            }
            br.close();
        } catch (IOException e) {
            throw new CustomArrayException(e);
        }
        return arraysIntList;
    }
}