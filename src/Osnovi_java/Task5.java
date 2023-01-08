package Osnovi_java;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите вес"); // эта строчка для красоты и понятности
        int weight = sc.nextInt();
        sc.close();

        if (weight <= 91) {
            System.out.println("Супертяжелый вес");
        } else if (weight <=75) {
            System.out.println("Тяжёлый вес");
        } else if (weight >=60) {
            System.out.println("Средний вес");
        } else {
            System.out.println("Лёгкий вес");
        }
    }
}

























