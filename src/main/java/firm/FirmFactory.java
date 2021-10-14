package firm;

public class FirmFactory {
    public static void main(String[] args) {
        Worker[] firmWorkers = {
                new Worker(new Human("Ivan", 24, Sex.MALE), Position.EMPLOYEE, 1200, 1),
                new Worker(new Human("Olga", 29, Sex.FEMALE), Position.EMPLOYEE, 1400, 2),
                new Worker(new Human("Alexey", 31, Sex.MALE), Position.DIRECTOR, 2500, 4),
                new Worker(new Human("Sergey", 33, Sex.MALE), Position.DIRECTOR, 3100, 6)
        };

        Firm firm = new Firm("firm", firmWorkers);
    }
}
