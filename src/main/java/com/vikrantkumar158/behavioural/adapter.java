package com.vikrantkumar158.behavioural;


interface Bird{
    void fly();
    void makeSound();
}

class Sparrow implements Bird
{
    @Override
    public void fly()
    {
        System.out.println("Sparrow is flying");
    }
    @Override
    public void makeSound()
    {
        System.out.println("Chirp....");
    }
}

interface Duck
{
    void squeak();
}

class PlasticDuck implements Duck
{
    @Override
    public void squeak()
    {
        System.out.println("Squeeeaakkk....");
    }
}

class BirdAdapter implements Duck{
    Bird bird;
    public BirdAdapter() {}
    public BirdAdapter(Bird bird)
    {
        this.bird = bird;
    }
    @Override
    public void squeak()
    {
        bird.makeSound();
    }
}

public class adapter
{
    public static void main(String[] args)
    {
        Sparrow sparrow = new Sparrow();
        Duck duck = new PlasticDuck();
        Duck birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("Duck");
        duck.squeak();

        System.out.println("Bird Adapter");
        birdAdapter.squeak();
    }
}