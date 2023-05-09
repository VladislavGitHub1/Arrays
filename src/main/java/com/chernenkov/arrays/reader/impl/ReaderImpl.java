package com.chernenkov.arrays.reader.impl;

import com.chernenkov.arrays.exceprion.CustomException;
import com.chernenkov.arrays.validator.StringArrayValidator;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReaderImpl {

    public List<int[]> readArray() {
        int[] result = new int[0];
        BufferedReader br = null;
        File directory = new File("./data");
        File file = new File(directory,"arrays.txt");
        List<int[]> arraysIntList = new ArrayList<>();
        try {br = new BufferedReader(new FileReader(file));
            String line;
            StringArrayValidator validator = new StringArrayValidator();
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
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return arraysIntList;
    }
}