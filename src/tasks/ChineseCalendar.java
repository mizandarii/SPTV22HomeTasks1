/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasks;

import java.util.Scanner;



public class ChineseCalendar {
    private Scanner scanner;
    public ChineseCalendar(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runZodiac() {
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        String color = " ";
        String animal = " ";

        switch (year % 5){
            case 0 :
                color = "зелен(ой/ого)";
                break;
            case 1:
                color = "красн(ой/ого)";
                break;
            case 2:
                color = "желт(ой/ого)";
                break;
            case 3:
                color = "бел(ой/ого)";
                break;
            case 4:
                color = "черн(ой/ого)";
                break;
        }
        switch (year % 12) {
          case 0: animal = "крысы"; break;
          case 1: animal = "коровы"; break;
          case 2: animal = "тигра"; break;
          case 3: animal = "зайца"; break;
          case 4: animal = "дракона"; break;
          case 5: animal = "змеи"; break;
          case 6: animal = "лошади"; break;
          case 7: animal = "овцы"; break;
          case 8: animal = "обезьяны"; break;
          case 9: animal = "курицы"; break;
          case 10: animal = "собаки"; break;
          case 11: animal = "змеи"; break;
        }
        
        System.out.println("год " + color + " " + animal);
      }
    
}
