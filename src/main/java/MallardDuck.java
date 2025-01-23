public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public String display() {
        return "Утка кряква!";
    }

    @Override
    public void fly() {
        System.out.println("Утка кряква полетела!");
    }

    @Override
    public void quack() {
        System.out.println("Утка кряква начала крякать!");
    }
}
