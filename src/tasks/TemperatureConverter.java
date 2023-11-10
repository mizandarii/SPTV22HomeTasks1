package tasks;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TemperatureConverter {
    private Scanner scanner;
    
public TemperatureConverter(Scanner scanner) {
    this.scanner = scanner;
}
    
    public void doConvert(){
        boolean repeat = true;
        do{
            System.out.println("выберите направление конвертации");
            System.out.println("0. Закончить задачу");
            System.out.println("1. Конвертировать из Цельсия в Фаренгейт");
            System.out.println("2. Конвертировать из Фаренгейта в Цельсий");
            System.out.print("задача номер:");
            int task = scanner.nextInt(); scanner.nextLine();
            switch(task) {
                case 0:
                    System.out.println("выбран выход из конвертора");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("конверт из Цельсия в Фаренгейт");
                    celsiusToFahrenheit();
                    break;
                case 2:
                    System.out.println("конверт из Фаренгейтa в Цельсий");
                    fahrenheitToCelsius();
                default:
                    System.out.println("выберите число из списка");
            
            }
            
        }
        while(repeat);
        }

    private void celsiusToFahrenheit() {
        System.out.println("введите температуру (Celsius):");
        double tCelsius = scanner.nextDouble(); scanner.nextLine();
        double tFarhenheit = tCelsius * 9 / 5 + 32;
        System.out.printf("результат (Farhenheit): %.1f%n", tFarhenheit);
    }

    private void fahrenheitToCelsius() {
        System.out.println("Введите температуру (Fahrenheit):");
        double tFahrenheit = scanner.nextDouble(); 
        double tCelsius = (tFahrenheit - 32) * 5 / 9;
        System.out.printf("результат (Celsius): %.1f%n", tCelsius);
    }
    
}