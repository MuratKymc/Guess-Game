package com.company;

public class RGenerator {
    private int value;

    public RGenerator(){
        this.value = (int)(Math.random()*100)+1;
    }

    public int getValue(){
        return this.value;
    }

    public  void changeValue(){
        this.value = (int)(Math.random()*100)+1;
    }

}
