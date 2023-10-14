// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import javax.management.DynamicMBean;
import java.util.Random;

public class Main  {
    Random rand = new Random();
        private int[] dynamicArray;
        public final int size = 10;

        // Конструктор для створення динамічного масиву заданого розміру
        public Main() {
            dynamicArray = new int[size];
            for (int i = 0; i < size; i++){
                if (i % 2 ==0){

                    dynamicArray[i] = rand.nextInt(100);
                }else{
                    dynamicArray[i] = i -1;
                }
            }
        }
    public int getSize() {
        return size;
    }



    public int getArray() {
            return dynamicArray[size];
        }
        public int calculate(){
            int result = 1;
            for (int i =2; i < size; i+=3){
                result *= dynamicArray[i];
            }
            return result;
        }
        public void printArray() {
            for (int i = 0; i < size; i++)
            {
                System.out.print(dynamicArray[i] + "\t");
            }
        }


        public static void main(String[] args) {
        Main myArray = new Main();
        int result = myArray.calculate();
            System.out.println("Result of calculate method " + result);
            System.out.println("Array elements:");
            myArray.printArray();

    }
}

