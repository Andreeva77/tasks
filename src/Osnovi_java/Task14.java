package Osnovi_java;

import java.util.Scanner;

public class Task14 {


    // Найти:
    // 1. Сумму всех целых чисел от 100 до 500
    // 2. Сумму всех целых чисел от a до b (значения  a и b вводятся с клавиатуры. b >= a


    public static void main(String[] args) {
        // Решаем первую часть задачи.
        // 1. Сумму всех целых чисел от 100 до 500
        int sum = 0;
        for (int i = 100; i < 500; i++) {
            sum += i; // Это тоже самое, что и запись  sum = sum + i
        }
        System.out.println(sum);

        // Решаем вторую часть задачи.
        // Сумму всех целых чисел от a до b (значения  a и b вводятся с клавиатуры. b >= a
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа a, b, где b>=a");  // Для удобства пользователя
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b >= a) {  // Если условие выполняется, то мы делаем то, что ниже
            int sum1 = 0;
            for (int i = a; i < b; i++) {
                sum1 += i; // sum1 = sum + i
            }
            System.out.println(sum1);
        } else {  // Если же условие не выполняется, то мы делаем, то что ниже, то есть выводим сообщение другое
            System.out.println("b < a, введите другие числа");
        }
    }
}




















