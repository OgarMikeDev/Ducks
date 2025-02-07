package model;

import fly_behavior.FlyWithWings;
import quack_behavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public String display() {
        return "Утка кряква!";
    }

}
