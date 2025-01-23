public class RubberDuck extends Duck {

    @Override
    public void fly() {
        System.out.println("К сожалению резиновая утка" +
                "не умеет летать :(");
    }

    @Override
    public String display() {
        return "Привет! Я резиновая утка! И путь тебя не смущает то, " +
                "что я умею говорить";
    }
}
