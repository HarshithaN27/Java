package com.todaytask;

//implements
interface Vehicle
{

    void start();
}

//extends
class Animal
{
    void eat()
    {
        System.out.println("Eating");
    }
}

class Dog extends Animal
{
    void bark()
    {

        System.out.println("Barking");
    }
}

class Car implements Vehicle

{

    public void start()
    {

        System.out.println("Car Started");
    }
}

public class Animals {
    public static void main(String[] args)
    {

        Car c = new Car();
        c.start();
    }
}

