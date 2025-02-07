package model;

import fly_behavior.FlyBehavior;
import fly_behavior.FlyNoWay;
import fly_behavior.FlyWithWings;
import quack_behavior.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;


    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Утка начала плавать!");
    }
    public abstract String display();
}
