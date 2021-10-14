package firm;

public class Worker {
    Human human;
    Position position;
    int salary;
    int experience;

    public Worker(Human human, Position position, int salary, int experience) {
        this.human = human;
        this.position = position;
        this.salary = salary;
        this.experience = experience;
    }
}