package com.music.kata.Animals;

public abstract class Animals {

    protected String name;
    protected String song;
    protected boolean isSinging = false;

    public Animals(String name, String sing) {
        this.name = name;
        this.song = sing;
    }

    public Animals() { //constructor vacÍo

    }


    public String getName() {
        return name;
    }

    public String getSong() {
        return song;
    }

    public boolean isSinging() {
        return isSinging;
    }

    public boolean initSinging() {
        return this.isSinging = true;
    }

    public boolean singingStop() {
        return this.isSinging = false;
    }

    public String message() {
        if(this.isSinging){
            return "The " + this.name + " is singing " + this.song;
        } return "The " + this.name + " is not singing";
    }
}

