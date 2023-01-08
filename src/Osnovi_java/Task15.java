package Osnovi_java;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        // Даны натуральное число n и вещественные числа: a1,  a2.....и до an
        // Определить среднее арифметическое вещественных чисел.

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите n ");
        int n = sc.nextInt();

        double sum = 0;
        for(int i = 1; i <= n; i++) {
            System.out.println("Введите число  ");
            double number = sc.nextDouble();
            sum += number;
        }

        System.out.println("Среднее арифметическое  " + sum/n);
    }
}






























































