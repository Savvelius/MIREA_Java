package Exercise2_5;

import Exercise1.Task3;
import Exercise2_4.Computer;

import java.util.Objects;
import java.util.Optional;
import java.util.Vector;

public class DogShelter {
    Vector<Dog> dogs = new Vector<Dog>();
    public void addDog(Dog dog) {
        dogs.add(dog);
    }
    public Optional<Dog> getDog(String name) {
        for (Dog dog : dogs) {
            if (Objects.equals(dog.getName(), name))
                return Optional.of(dog);
        }
        return Optional.empty();
    }
    public void fillFromConsole() {
        while (true) {
            System.out.println("Enter dog's name (or EXIT to exit):");
            String name = System.console().readLine();
            if (name.equals("EXIT"))
                break;
            System.out.println("Enter dog's age:");
            int age = Task3.readInt();
            dogs.add(new Dog(name, age));
        }
    }
    @Override
    public String toString() {
        return "DogShelter(dogs = " + dogs + ")\n";
    }
    public static DogShelter test() {
        DogShelter shelter = new DogShelter();
        shelter.fillFromConsole();
        System.out.println(shelter);
        return shelter;
    }
}
