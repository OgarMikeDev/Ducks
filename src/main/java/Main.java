public class Main {
    public static void main(String[] args) {
        MallardDuck firstMallardDuck = new MallardDuck();
        firstMallardDuck.swim();
        firstMallardDuck.quack();
        System.out.println(firstMallardDuck.display());

        RedheadDuck firstRedheadDuck = new RedheadDuck();
        firstRedheadDuck.swim();
        firstRedheadDuck.quack();
        System.out.println(firstRedheadDuck.display());

        RubberDuck firstRubberDuck = new RubberDuck();
        firstRubberDuck.swim();
        firstRubberDuck.quack();
        System.out.println(firstRubberDuck.display());
    }
}
