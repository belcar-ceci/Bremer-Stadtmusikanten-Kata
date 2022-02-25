package com.music.kata.AnimalTest;

import com.music.kata.Animals.Cat;
import com.music.kata.Animals.Donkey;
import org.junit.jupiter.api.Test;


import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

}