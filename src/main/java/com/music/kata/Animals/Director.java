package com.music.kata.Animals;

import java.util.ArrayList;

public class Director {
    ArrayList<Animals> choir = new ArrayList<>();

    public Director(ArrayList<Animals> choir) {
        this.choir = choir;
    }

    public void startSinging() {
        for (Animals animals : choir){
            animals.sing();
        }
    }

    public void stopSinging() {
        for (Animals animals : choir){
            animals.shutUp();
        }
    }
}
