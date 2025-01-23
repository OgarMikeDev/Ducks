public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    public String display() {
        return "Красноголовая утка!";
    }

    @Override
    public void fly() {
        System.out.println("Красноголовая утка полетела!");
    }

    @Override
    public void quack() {
        System.out.println("Красноголовая утка начала крякать!");
    }
}
