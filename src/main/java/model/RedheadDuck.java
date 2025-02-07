package model;

import fly_behavior.FlyWithWings;
import quack_behavior.Quack;

public class RedheadDuck extends Duck {

    @Override
    public String display() {
        return "Красноголовая утка!";
    }

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
