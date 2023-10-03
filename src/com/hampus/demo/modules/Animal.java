package com.hampus.demo.modules;

//Abstract - Inheritance
public interface Animal
{
    //Abstract method
    void eatFood();
    void move();
    void animalNoise();

    void typeOfAnimal();

    default void nameOfAnimal(String name){
        System.out.println(name);
    }
}
