public class DecorDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("К сожалению деревянная утка" +
                "не умеет крякать :(");
    }

    @Override
    public void fly() {
        System.out.println("К сожалению деревянная утка " +
                "не умеет летать :(");
    }

    @Override
    public String display() {
        return "Привет! Я деревянная утка! И путь тебя не смущает то, " +
                "что я умею говорить";
    }
}
