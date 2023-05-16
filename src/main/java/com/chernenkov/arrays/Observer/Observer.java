package com.chernenkov.arrays.Observer;

import com.chernenkov.arrays.entity.CustomArray;

public interface Observer {
    public void handleEvent(CustomArray array);
}
