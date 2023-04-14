package com.snapolitano.exercises.oop.basic;

public class ClickCounter {
    int value;
    public int getValue(){
        return value;
    }
    public void click(){
        value++;
    }

    public void undo(){
        value = Math.max(0, value-1);
    }
    public void reset(){
        value=0;
    }

    public ClickCounter(){
        value = getValue();
    }
}
