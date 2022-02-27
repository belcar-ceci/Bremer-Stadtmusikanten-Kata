package com.music.kata.AnimalTest;

import com.music.kata.Animals.Animals;
import com.music.kata.Animals.Cat;
import com.music.kata.Animals.Director;
import com.music.kata.Animals.Donkey;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalSingTest {
    @Test
    void createdAnimal() {
        Cat cat = new Cat("cat", "purrr");
        assertThat((cat.getName()), equalTo("cat"));
        assertThat((cat.getSong()), equalTo("purrr"));
    }
    @Test
    void catCanSing(){
        Cat cat = new Cat("cat", "purrr");
        assertFalse(cat.isSinging());
    }
    @Test
    void catCanInitSinging(){
        Cat cat = new Cat("cat", "purrr");
        cat.initSinging();
        assertTrue(cat.isSinging());
    }
    @Test
    void catSingingStop(){
        Cat cat = new Cat("cat", "prrr");
        cat.initSinging();
        cat.singingStop();
        assertFalse(cat.isSinging());
    }
    @Test
    void whenCatSingSendMessage(){
        Cat cat = new Cat("Felix", "prrr");
        cat.initSinging();
        assertThat(cat.message(), equalTo("The cat Felix is singing prrr"));
    }
    @Test
    void whenCatNotSingSendMessage(){
        Cat cat = new Cat("Felix", "prrr");

        assertThat(cat.message(), equalTo("The cat Felix isn't singing prrr"));

    }
    @Test
    void whenDonkeySingSendMessage(){
        Donkey donkey = new Donkey("Homero", "ioooiooo");
        donkey.initSinging();
        assertThat(donkey.message(), equalTo("The donkey Homero is singing ioooiooo"));

    }
    @Test
    void whenDonkeyNotSingSendMessage(){
        Donkey donkey = new Donkey("Homero", "ioooiooo");

        assertThat(donkey.message(), equalTo("The donkey Homero isn't singing ioooiooo"));
    }
    @Test
    void directorOrderSing(){
        ArrayList<Animals> choir = new ArrayList<>();
        choir.add(new Cat("Felix", "prrr"));
        choir.add(new Donkey("Homero", "ioooioo"));

        Director director = new Director(choir);
        director.startSinging();

        assertEquals("The cat Felix isn't singing prrr", choir.get(0).message());
        assertEquals("The donkey Homero isn't singing ioooioo", choir.get(1).message());
    }
   @Test
    void directorOrderSilence(){
        ArrayList<Animals> choir = new ArrayList<>();
        choir.add(new Cat("Felix", "prrr"));
        choir.add(new Donkey("Homero", "does not shut up"));

        Director director = new Director(choir);
        director.startSinging();
        director.stopSinging();

        assertEquals("The cat Felix isn't singing prrr", choir.get(0).message());
        assertEquals("The donkey Homero isn't singing does not shut up", choir.get(1).message());
   }

}