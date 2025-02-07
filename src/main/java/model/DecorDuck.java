package model;

import fly_behavior.FlyNoWay;
import quack_behavior.MuteQuack;

public class DecorDuck extends Duck {

    public DecorDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    @Override
    public String display() {
        return "Привет! Я деревянная утка! И путь тебя не смущает то, " +
                "что я умею говорить";
    }
}
