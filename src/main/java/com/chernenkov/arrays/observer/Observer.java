package com.chernenkov.arrays.observer;

import com.chernenkov.arrays.entity.CustomArray;

public interface Observer {
    public void handleEvent(CustomArray array);
}
