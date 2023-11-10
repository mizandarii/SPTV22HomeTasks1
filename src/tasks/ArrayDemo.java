package tasks;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ArrayDemo {
    private Scanner scanner;
    public ArrayDemo(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runDemo() {
        int[] myArray = new int[20];
        Random random = new Random();
        
        for(int i = 0; i < myArray.length; i++) {
            int randomNumber = random.nextInt(19 - 0 + 1) + 0;
            if (randomNumber % 2 == 0){
                myArray[i] = randomNumber; 
            } 
        }
        System.out.println("Массив из 20 рандомных чисел");
        for (int i = 0; i < myArray.length; i++){
            System.out.printf("%3d", myArray[i]);
        }
        System.out.println();
        System.out.println("среднее арифметическое элементов без учета максимального и минимального числа");
        
        int max = myArray[0];
        int min = myArray[0];
        int sum = myArray[0];
        
        for (int i = 1; i < myArray.length; i++) {
            sum += myArray[i];
            if (myArray[i] > max)
                max = myArray[i];
            else if (myArray[i] < min)
                min = myArray[i];
        }
        
        float x = ((sum - max - min) / (myArray.length - 2));
        System.out.println(x);

        //System.out.println(sum);
    }
    
}