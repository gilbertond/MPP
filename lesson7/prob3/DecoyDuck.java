package edu.mum.lesson7.prob3;

public class DecoyDuck extends Duck {

    public DecoyDuck() {}

    @Override
    public void display() {
        System.out.println("  displaying");

    }

    @Override
    public void quack() {
        System.out.println("  cannot quack");
    }

    @Override
    public void fly() {
        System.out.println("  cannot fly");
    }

    @Override
    public void swim() {
        System.out.println("  swimming");
    }
    
    
}
