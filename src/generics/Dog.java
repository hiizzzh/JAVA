package generics;

public class Dog extends Animal{
    private int id;

    // Constructor for Dog class
    public Dog(int id) {
        super(id); // Call the constructor of the superclass (Animal) with the id parameter
        this.id = id;
    }

    // Getter method to retrieve the id property
    public int getId() {
        return id;
    }
}
