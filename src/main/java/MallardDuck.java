import fly_behavior.FlyWithWings;
import quack_behavior.Quack;

public class MallardDuck extends Duck {
    @Override
    public String display() {
        return "Утка кряква!";
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
