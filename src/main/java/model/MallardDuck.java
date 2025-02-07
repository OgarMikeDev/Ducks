package model;

import fly_behavior.FlyWithWings;
import quack_behavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
    }

    @Override
    public String display() {
        return "Утка кряква!";
    }

}
