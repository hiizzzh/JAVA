package AnonimClass;

import java.sql.SQLOutput;

class Animal{
    public void eat(){
        System.out.println("Animal is eating...");
    }

}
public class AnotherExpml {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Animal animal2 = new Animal(){
            @Override
            public void eat() {
                System.out.println("Animal2 is eating...");
            }

        };
        animal2.eat();
    }
}
