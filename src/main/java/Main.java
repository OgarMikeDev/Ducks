public class Main {
    public static void main(String[] args) {
        MallardDuck firstMallardDuck = new MallardDuck();
        firstMallardDuck.swim();
        firstMallardDuck.quack();
        firstMallardDuck.fly();
        System.out.println(firstMallardDuck.display());

        System.out.println();

        RedheadDuck firstRedheadDuck = new RedheadDuck();
        firstRedheadDuck.swim();
        firstRedheadDuck.quack();
        firstRedheadDuck.fly();
        System.out.println(firstRedheadDuck.display());

        System.out.println();

        RubberDuck firstRubberDuck = new RubberDuck();
        firstRubberDuck.swim();
        firstRubberDuck.quack();
        firstRubberDuck.fly();
        System.out.println(firstRubberDuck.display());

        System.out.println();

        DecorDuck firstDecorDuck = new DecorDuck();
        firstDecorDuck.swim();
        firstDecorDuck.quack();
        firstDecorDuck.fly();
        System.out.println(firstDecorDuck.display());
    }
}
