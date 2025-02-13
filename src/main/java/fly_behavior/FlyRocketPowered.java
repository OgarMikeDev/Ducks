package fly_behavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Я летаю на ракете!");
    }
}
