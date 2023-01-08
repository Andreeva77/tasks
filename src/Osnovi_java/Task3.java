package Osnovi_java;

import java.util.Scanner;

public class Task3 {

    //1 Дано натуральное число. Определить:
    // а. является ли оно чётным?
    // b. Оканчивается ли оно цифрой 7?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        if (number % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }

        if (number % 10 ==7) {
            System.out.println("Число оканчивается на 7");
        }
    }
}



























