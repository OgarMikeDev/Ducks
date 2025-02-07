import model.*;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        System.out.println(duck.display());
        duck.swim();
        duck.performFly();
        duck.performQuack();

//        System.out.println();
//
//        model.RedheadDuck firstRedheadDuck = new model.RedheadDuck();
//        System.out.println(firstRedheadDuck.display());
//        firstRedheadDuck.swim();
//        firstRedheadDuck.fly();
//
//        System.out.println();
//
//        model.RubberDuck firstRubberDuck = new model.RubberDuck();
//        System.out.println(firstRubberDuck.display());
//        firstRubberDuck.swim();
//
//        System.out.println();
//
//        model.DecorDuck firstDecorDuck = new model.DecorDuck();
//        System.out.println(firstDecorDuck.display());
//        firstDecorDuck.swim();
    }
}
