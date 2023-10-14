package generics;

import java.util.ArrayList;
import java.util.List;

// The "Generics" class demonstrates the use of generic types in Java.
public class Generics {
    public static void main(String[] args) {
        // Creating a generic list of Strings
        List<String> list = new ArrayList<>(); // "<data type>" is how parameterization works
        list.add("kuku");
        System.out.println(list);

        // Creating a generic list of Animals
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));
        test(listOfAnimal); // Calling the test method with a list of Animals
        test2(listOfAnimal); // Calling the test2 method with a list of Animals
        // Creating a generic list of Dogs, which extends Animal
        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog(5));
        listOfDogs.add(new Dog(7));
        test(listOfDogs); // Calling the test method with a list of Dogs
        test2(listOfDogs); // Calling the test2 method with a list of Dogs
    }

    // Method to test generic wildcard upper-bounded list
    public static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                System.out.println(dog.getId()); // Accessing specific method of Dog class
            }else {
                System.out.println(animal);
            }
        }
    }

    // Method to test generic wildcard upper-bounded list with specific behavior
    public static void test2(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat(); // Calling the eat method on each animal in the list
        }
    }
}