package Interface;

public class Animal implements Info{
    String name;
    int age;
    public Animal(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("Her name: " + name + ", and she is " + age + " y.o.");
    }
}
