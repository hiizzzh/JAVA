package Polimorfizm;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        printInfo(dog);
        printInfo(cat);
        printInfo(animal);
    }
    public static void printInfo(Animal animal){
        animal.eat();
    }
}
