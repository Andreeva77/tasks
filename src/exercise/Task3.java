package exercise;

/* 1 Заполнить массив из двенадцати элементов 1,2,3,,,12
   2 Вывести элементы массива на экран в обратном порядке
   3 Определить сумму всех элементов массива
   4 Произведение всех элементов массива
   5 Сумму квадратов всех элементов массива
   6 Сумму шести первых элементов массива */

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[] array = new int[12];
        Random r = new Random();

        // 1 Сумму всех элементов массива
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + (array[i] + 1);
        }
        System.out.println("\nСума всех элементов = " + sum);

        // 2 Произведение всех элементов
        int product = 1;
        for (int i = 1; i < array.length; i++) {
            product = product * (array[i] + 1);
        }
        System.out.println("Произведение всех элементов = " + product);

        // 3 Сумма квадрато всех элементов массива
        double sqrSum = 0;
        for (int i = 0; i < array.length; i++) {
            double sqrtElement = Math.sqrt(array[i]+1);
            sqrSum = sqrtElement + sqrSum;
        }
        System.out.println("Сумма квадратов всех элементов = " + sqrSum);

        int sum6 = 0;
        for (int i = 0; i < array[6]; i++) {
            sum6 = sum6 + (array[i] + 1);
        }
        System.out.println("Сумма первых шести элементов = " + sum6);
    }
}


















