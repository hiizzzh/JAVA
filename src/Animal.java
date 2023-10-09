import java.util.Random;

public class Animal {
    public  void Hello() {
        Random rand = new Random();
        int[] dynamicArray;
        int size = 10;
        dynamicArray = new int[size];
        for (int i = 0; i < size; i++){
            if (i % 2 ==0){

                dynamicArray[i] = rand.nextInt(100);
            }else{
                dynamicArray[i] = i -1;
            }
        }
        for (int i = 0; i < size; i++){
            System.out.print(dynamicArray[i]);
            System.out.print(".");
        }
        System.out.println(" ");
    }


}
