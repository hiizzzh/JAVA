package AnonimClass;
interface AbleToEat{
    public void eat();

}
public class Test {
    public static void main(String[] args) {
        AbleToEat animal1 = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("I'm eating");
            }
        };
    }
}
