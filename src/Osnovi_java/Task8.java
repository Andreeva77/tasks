package Osnovi_java;

import java.util.Scanner;

public class Task8 {
    // Напишите метод, который бы возвращал в консоль:
    // * true, если число больше или равно 5
    // * false, если число меньше 5

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();

        System.out.println("Результат" + greaterThan5(number));
    }

    public static boolean greaterThan5(int number) {
        boolean result = true;
        //    if (number >5) {
        //    result = true;
        // }
        if (number < 5) {
            result = false;
        }
        return result;
    }
}

































