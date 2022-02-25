package com.music.kata.Animals;

public class Cat extends Animals{//Se crea clase que extiende clase animal

    public Cat (String name, String sound){//se establecen tipo datos y name
        super(name, sound);//El super() en Java es una variable de referencia que se utiliza para hacer
        // referencia a los constructores de clases principales.(se applica en cat y donkey)
    }
    public Cat(){//CONSTRUCTOR VAC-IO

    }
    public String message(){
        if(this.isSinging){
            return "The cat " + this.name + " is singing " + this.song;
        } return "The cat " + this.name + " isn't singing " + this.song;

    }


}
