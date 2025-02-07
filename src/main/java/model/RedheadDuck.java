package model;

import fly_behavior.FlyWithWings;
import quack_behavior.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
    }

    @Override
    public String display() {
        return "Красноголовая утка!";
    }

}
