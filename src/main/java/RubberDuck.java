public class RubberDuck extends Duck implements Quackable {
    @Override
    public String display() {
        return "Привет! Я резиновая утка! И путь тебя не смущает то, " +
                "что я умею говорить";
    }

    @Override
    public void quack() {
        System.out.println("Резиновая утка начала пищать!");
    }
}
