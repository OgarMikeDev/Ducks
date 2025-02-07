package model;

import fly_behavior.FlyWithWings;
import quack_behavior.Quack;

public class MallardDuck extends Duck {
    @Override
    public String display() {
        return "Утка кряква!";
    }

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
