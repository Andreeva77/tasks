package Osnovi_java;

import java.util.Scanner;

public class Task17 {

    // Дана не пустая последовательность чисел, оканчивающаяся нулём. Найти:
    //  1. Сумму всех чисел последовательности;
    // 2. Количество всех чисел последовательности
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  // Создаём сканер
      System.out.println("Введите несколько чисел. после ввода 0 ввод считается законченным");

      int number = 0; // Определяем переменную number
        int sum = 0;
        int count = 0;
        do {
            number = sc.nextInt(); // Считаем введённое пользователем число в переменную number
            sum += number;
            count++;
        } while (number != 0); // Сравним до тех пор, пока number не равен нулю
                               // Как только введённое число равно  нулю, то цикл завершится

        System.out.println("Сумма всех чисел =  " + sum);
        System.out.println("Количество всех чисел =  " + count);
    }
}
















