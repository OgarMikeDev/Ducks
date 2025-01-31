import fly_behavior.FlyNoWay;
import fly_behavior.FlyWithWings;
import quack_behavior.MuteQuack;
import quack_behavior.Quack;

public class DecorDuck extends Duck {

    public void fly() {
        FlyNoWay flyNoWay = new FlyNoWay();
        flyNoWay.fly();
    }

    public void quack() {
        MuteQuack muteQuack = new MuteQuack();
        muteQuack.quack();
    }

    @Override
    public String display() {
        return "Привет! Я деревянная утка! И путь тебя не смущает то, " +
                "что я умею говорить";
    }
}
