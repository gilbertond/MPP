package edu.mum.lesson7.prob3;

public class MallardDuck extends Duck {

    public MallardDuck() {}

    @Override
    public void display() {
        System.out.println("  display");
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
