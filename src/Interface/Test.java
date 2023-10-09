package Interface;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Bobik", 3);
        Human human1 = new Human("Pasha", 18);
        outPutInfo(human1);
        outPutInfo(animal1);
    }
    public static void outPutInfo(Info info){
        info.showInfo();
    }
}
