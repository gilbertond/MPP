package edu.mum.lesson7.prob3;

public class RedheadDuck extends Duck {

    public RedheadDuck() {}

    @Override
    public void display() {
        System.out.println("  displaying");
    }

    @Override
    public void quack() {
        System.out.println("  quacking");
    }

    @Override
    public void fly() {
        System.out.println("  fly with wings");
    }

    @Override
    public void swim() {
        System.out.println("  swimming");
    }
}
