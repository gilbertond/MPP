package edu.mum.lesson7.prob3;

abstract public class Duck implements FlyBehavior, QuackBehavior{

    abstract public void display();

    public void swim() {
        System.out.println("  swimming");
    }
    
    @Override
    public abstract void fly();

    @Override
    public abstract void quack();
}
