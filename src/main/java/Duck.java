public abstract class Duck {
    public void quack() {
        System.out.println("Кря!");
    }

    public void swim() {
        System.out.println("Утка начала плавать!");
    }

    public void fly() {
        System.out.println("Утка полетела!");
    }

    public abstract String display();
}
