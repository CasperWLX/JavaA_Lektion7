package com.hampus.demo.modules;

public class Cat implements Animal
{
    private String typeOfAnimal = "Cat";

    @Override
    public void eatFood()
    {
        System.out.println("Eats some fish");
    }

    @Override
    public void move()
    {
        System.out.println("Strolls around gracefully");
    }

    @Override
    public void animalNoise()
    {
        System.out.println("Meow Meow");
    }

    @Override
    public void typeOfAnimal()
    {
        System.out.println(typeOfAnimal);
    }
}
