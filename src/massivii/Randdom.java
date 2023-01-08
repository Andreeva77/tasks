package massivii;

import java.util.Random;

import static java.util.Arrays.deepToString;

public class Randdom {

    //1 Используя датчик случайных чисел, заполнить массив из 20 элементов. Вывести случайные массивы на экран
    //2 напечатать все неотрицательные элементы
    //3 все элементы не превышающие число 100

    public static void main(String[] args) {
        Double[] array = new Double[20]; // Определяем массив
        Random r = new Random();

        for(int i = 0; i < array.length; i++) {  // Заполняем массив рандомом
            array[i] = r.nextDouble(-200, 200); // генерируется следующее рандомное число, верхняя граница 200
        }
        System.out.println(deepToString(array)); // Вывести всё что есть

        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0) {// Вывод элементов не отрицательных
                System.out.print(array[i] + "");
            }
        }

        System.out.println(); // Отступ

        for (int i = 0; i < array.length; i++) {
            if(array[i] <= 100) {// Вывод элементов не превышающих 100
                System.out.print(array[i] + "");
            }
        }

    }
}


















