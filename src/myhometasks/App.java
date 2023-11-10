package myhometasks;

import tasks.WeatherInYear;
import tasks.CreateBooksArray;
import java.util.Scanner;
import tasks.ArrayDemo;
import tasks.ChineseCalendar;
import tasks.CreateBooksArray;
import tasks.NumberParser;
import tasks.TemperatureConverter;
import tasks.MultiplicationTable;

/**
 *
 * @author admin
 */
public class App {
    private Scanner scanner;
    
    public App(){
        this.scanner = new Scanner(System.in);
    }
    public void run(){
        boolean repeat = true;
        do{
            System.out.println("Выберите задачу:");
            System.out.println("0. Закончить программу:");
            System.out.println("1. Конверетер температуры:");
            System.out.println("2. Количество десятков числа; сумма цифр:");
            System.out.println("3. создание массива книг:");
            System.out.println("4. Задача с массивом из 20-ти чисел");
            System.out.println("5. Температура в году");
            System.out.println("6. Восточный календарь");
            System.out.println("7. Таблица умножения");

            int task = scanner.nextInt(); scanner.nextLine();
            switch(task) {
                case 0:
                    System.out.println("выбран выход из программы");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("выбрана задача 1");
                    TemperatureConverter temperatureConverter;
                    temperatureConverter = new TemperatureConverter(scanner);
                    temperatureConverter.doConvert();
                    break;    
                case 2:
                    System.out.println("выбрана задача 2");
                    NumberParser numberParser = new NumberParser(scanner);
                    numberParser.doParse();
                    break;
                 case 3:
                    System.out.println("выбрана задача 3");
                    CreateBooksArray createBooksArray;
                    createBooksArray = new CreateBooksArray();
                    createBooksArray.doCreateArray();
                    break;    
                case 4:
                    System.out.println("выбрана задача 4");
                    ArrayDemo arrayDemo;
                    arrayDemo = new ArrayDemo(scanner);
                    arrayDemo.runDemo();
                    break;
                case 5:
                    System.out.println("выбрана задача 5");
                    WeatherInYear weatherInYear;
                    weatherInYear = new WeatherInYear(scanner);
                    weatherInYear.runTask();
                    break; 
                case 6:
                    System.out.println("выбрана задача 6");
                    ChineseCalendar chineseCalendar;
                    chineseCalendar = new ChineseCalendar(scanner);
                    chineseCalendar.runZodiac();
                case 7:
                    System.out.println("выбрана задача 7");
                    MultiplicationTable multiplicationTable;
                    multiplicationTable = new MultiplicationTable(scanner);
                    multiplicationTable.checkMultiplication();
                default:
                    System.out.println("выберите номер из списка!");
        }
    }while(repeat);
    System.out.println("До свидания!");
}


}    
