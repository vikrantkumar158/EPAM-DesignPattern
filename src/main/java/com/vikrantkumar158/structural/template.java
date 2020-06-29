package com.vikrantkumar158.structural;


abstract class Game{
    abstract void initialize();
    abstract void start();
    abstract void end();
    public final void play(){
        initialize();
        start();
        end();
    }
}

class Chess extends Game
{
    @Override
    void initialize()
    {
        System.out.println("Chess Initialized");
    }
    @Override
    void start()
    {
        System.out.println("Chess Started");
    }
    @Override
    void end()
    {
        System.out.println("Chess Finished");
    }
}

class footBall extends Game{
    @Override
    void initialize()
    {
        System.out.println("footBall Initialized");
    }
    @Override
    void start()
    {
        System.out.println("footBall Started");
    }
    @Override
    void end()
    {
        System.out.println("footBall Finished");
    }
}

public class template
{
    public static void main(String[] args) throws InstantiationException,IllegalAccessException,ClassNotFoundException
    {
        Class c = Class.forName("Ritika_DesignPattern.structural.Chess");
        Game game = (Game)c.newInstance();
        game.play();
    }
}