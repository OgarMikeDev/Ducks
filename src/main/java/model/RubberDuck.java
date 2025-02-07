package model;

import fly_behavior.FlyNoWay;
import quack_behavior.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
    }
    @Override
    public String display() {
        return "Привет! Я резиновая утка! И путь тебя не смущает то, " +
                "что я умею говорить";
    }
}
