package clinic;


public class ClinicPet {
    public static void main(String[] args) {
        Animal[] clinicAnimal = {};
        Worker[] clinicWorkers = {
        };

        Clinic clinic = new Clinic("clinic", clinicWorkers);
        Animal animal = new Animal("animal",clinicAnimal);
    }

}
