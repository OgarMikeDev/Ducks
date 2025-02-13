package model;

import fly_behavior.FlyNoWay;
import quack_behavior.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public String display() {
        return "Я утка-приманка!";
    }
}
