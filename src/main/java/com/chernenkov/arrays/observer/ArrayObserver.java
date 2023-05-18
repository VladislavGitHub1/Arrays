package com.chernenkov.arrays.observer;

import com.chernenkov.arrays.entity.CustomArray;

public interface ArrayObserver {
    public void handleEvent(CustomArray array);
}
