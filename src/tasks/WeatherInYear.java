package tasks;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class WeatherInYear {

    private final Scanner scanner;
    private int j;
    private enum MONTHS {
        Январь, Февраль, Март, Апрель, Май, Июнь, Июль, Август, Сентябрь, Октябрь, Ноябрь, Декабрь 
    }

    public WeatherInYear(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runTask() {
        
        Random random = new Random();
        int min = -30;
        int max = 35;
        System.out.println("массив погоды в году по месяцам:");
        int[][] weatherInYear = new int[12][];
        weatherInYear[0] = new  int[31];
        weatherInYear[1] = new  int[28];
        weatherInYear[2] = new  int[31];
        weatherInYear[3] = new  int[30];
        weatherInYear[4] = new  int[31];
        weatherInYear[5] = new  int[30];
        weatherInYear[6] = new  int[31];
        weatherInYear[7] = new  int[31];
        weatherInYear[8] = new  int[30];
        weatherInYear[9] = new  int[31];
        weatherInYear[10] = new  int[30];
        weatherInYear[11] = new  int[31];
        for (int i = 0; i < weatherInYear.length; i++) {
            for(int j = 0; j < weatherInYear[i].length; j++) {
                /**weatherInYear[i][j] = random.nextInt(max - min + 1) + min;**/
                if (i == 0 || i == 1 || i == 11){
                    weatherInYear[i][j] = random.nextInt(5 - min + 1) + min;
                }
                else if (i == 2 || i == 3 || i == 4 || i==10 || i == 9 || i == 8){
                    weatherInYear[i][j] = random.nextInt(20 - 1 + 1) + 1;
                }
                else if (i == 5|| i == 6 || i == 7){
                    weatherInYear[i][j] = random.nextInt(max - 10 + 1) + 10;
                }
            }
        }
        for (int i = 0; i < weatherInYear.length; i++) {
            System.out.println(" ");
            for(int si = 0; si<32; si++){
                System.out.printf("%4d", si+1);
            }
            System.out.println();
            System.out.println("---------------");
            System.out.printf("%10s: ", MONTHS.values()[i]);
            for(int j = 0; j < weatherInYear[i].length; j++) {
               System.out.printf("%4d", weatherInYear[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("Средняя погода по каждому месяцу");
        for (MONTHS m : MONTHS.values()){
            System.out.println(m);
            
        }
        System.out.println("Введите число для отображения температуры");
        System.out.println("день:");
        int day = scanner.nextInt();
        System.out.println("месяц:");
        int month = scanner.nextInt();
        System.out.println(weatherInYear[month-1][day-1]);
    }
    
}