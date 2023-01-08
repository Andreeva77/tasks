package exercise;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* Дан массив (значит ввод данных через Сканер или Рандом) */


        int[] array = new int[12];

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
         for (int i = 0; i < 12; i++) {  // Вывести не отрицательные элементы массива
            if(array[i] > 0) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
