/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasks;

import java.util.Scanner;
import java.util.Random;
import java.io.*;


public class MultiplicationTable {
    private Scanner scanner;
    public MultiplicationTable(Scanner scanner) {
        this.scanner = scanner;
    }

    public void checkMultiplication() {
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        int count = 0;

        
        Random random = new Random();
        for (int i = 1; i <= 5; i++){
            int n1 = random.nextInt((10 - 1) + 1);
            int n2 = random.nextInt((10 - 1) + 1);
            System.out.println(n1 + "*" + n2 + "=");
            int user = scanner.nextInt();
            int right = n1 * n2;
            if (user == right){
                System.out.println(GREEN + "Правильно" + RESET); 
                count++;
            }
            else{
                System.out.println(RED + "Неправильно" + RESET);
            }
        }
        System.out.println(count);
        if (count == 0 || count == 1 || count == 2) {
            System.out.println("Срочно учить!");
        }
        else if (count == 3 || count == 4){
            System.out.println("Надо бы еще подучить..");
        }
        else if (count == 5){
            System.out.println("Молодец!");
        }
    }
}
    

