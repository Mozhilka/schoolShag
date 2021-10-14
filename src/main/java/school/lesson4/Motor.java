package school.lesson4;

public class Motor extends Car {

    private String name;

    public void start() {
        System.out.println(name + " завелась ");
    }
    public void drive() {
        System.out.println(name + " поехала ");
    }

}
