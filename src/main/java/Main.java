public class Main {
    public static void main(String[] args) {
        MallardDuck firstMallardDuck = new MallardDuck();
        System.out.println(firstMallardDuck.display());
        firstMallardDuck.swim();
        firstMallardDuck.quack();
        firstMallardDuck.fly();

        System.out.println();

        RedheadDuck firstRedheadDuck = new RedheadDuck();
        System.out.println(firstRedheadDuck.display());
        firstRedheadDuck.swim();
        firstRedheadDuck.quack();
        firstRedheadDuck.fly();

        System.out.println();

        RubberDuck firstRubberDuck = new RubberDuck();
        System.out.println(firstRubberDuck.display());
        firstRubberDuck.swim();
        firstRubberDuck.quack();

        System.out.println();

        DecorDuck firstDecorDuck = new DecorDuck();
        System.out.println(firstDecorDuck.display());
        firstDecorDuck.swim();
    }
}
