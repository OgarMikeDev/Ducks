import fly_behavior.FlyNoWay;
import quack_behavior.MuteQuack;

public class DecorDuck extends Duck {
    @Override
    public String display() {
        return "Привет! Я деревянная утка! И путь тебя не смущает то, " +
                "что я умею говорить";
    }

    public void fly() {
        FlyNoWay flyNoWay = new FlyNoWay();
        flyNoWay.fly();
    }

    public void quack() {
        MuteQuack muteQuack = new MuteQuack();
        muteQuack.quack();
    }
}
