package com.hampus.demo;

import com.hampus.demo.modules.Cat;
import com.hampus.demo.modules.Dog;
import com.hampus.demo.modules.Squirrel;

public class Main
{
    public static void main(String[] args)
    {
        Cat blackCat = new Cat();
        Dog blackDog = new Dog();
        blackDog.animalNoise();
        blackDog.eatFood();
        blackDog.move();
        blackDog.typeOfAnimal();
        blackDog.nameOfAnimal("Christiano");

        blackCat.nameOfAnimal("Ronaldo");
        blackCat.animalNoise();
        blackCat.eatFood();
        blackCat.move();

        Squirrel benny = new Squirrel();
        benny.eat();
        benny.makeSound();
    }
}
