package model;

import fly_behavior.FlyWithWings;
import quack_behavior.Quack;

public class RedheadDuck extends Duck {

    @Override
    public String display() {
        return "Красноголовая утка!";
    }

    public void fly() {
        FlyWithWings flyWithWings = new FlyWithWings();
        flyWithWings.fly();
    }

    public void quack() {
        Quack quack = new Quack();
        quack.quack();
    }
}
