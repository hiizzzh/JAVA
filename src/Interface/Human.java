package Interface;

public class Human implements Info {
    String name;
    int age;
    public Human(String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("His name: " + name + ", and he is " + age + " y.o.");
    }
}
