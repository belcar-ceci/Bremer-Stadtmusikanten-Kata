package com.music.kata.Animals;

public class Donkey extends Animals{

    public Donkey(String name, String sing ){
        super(name, sing);
    }
    public Donkey(){//CONSTRUCTOR VAC-IO

    }
    public String message(){
        if(this.isSinging){
            return "The donkey " + this.name + " is singing " + this.song;
        } return "The donkey " + this.name + " isn't singing " + this.song;

    }

}
