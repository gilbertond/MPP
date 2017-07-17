package edu.mum.lesson7.prob3;

public class RubberDuck extends Duck {

    public RubberDuck() {}

    @Override
    public void quack() {
        System.out.println("  squeaking");
    }

    @Override
    public void fly() {
        System.out.println("  cannot fly");
    }

    @Override
    public void swim() {
        System.out.println("  swimming");
    }

    @Override
    public void display() {
        System.out.println("  displaying");

    }
}
