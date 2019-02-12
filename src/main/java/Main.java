import Animals.*;

import java.util.*;

public class Main {

    public static void main(String args[]) {
        Reservation reservations = new Reservation();

        reservations.NewDog("Kaeti", Gender.FEMALE);
        reservations.NewCat("Simba", Gender.MALE, "Escaping");

        List<Animal> animals = reservations.getAnimals();
        for (Iterator<Animal> i = animals.iterator(); i.hasNext();) {

            Animal animal = i.next();
            System.out.println(animal.toString());
            System.out.println(animal.getPrice());
        }
    }
}
