package com.hampus.demo.modules;

public class Dog implements Animal
{
    String typeOfAnimal = "Dog";
    @Override
    public void animalNoise()
    {
        System.out.println("woof woof, bark bark");
    }

    @Override
    public void move()
    {
        System.out.println("Run around frantically");
    }

    @Override
    public void eatFood()
    {
        System.out.println("Chomps on a bone, devours it all");
    }

    @Override
    public void typeOfAnimal()
    {
        System.out.println(typeOfAnimal);
    }
}
