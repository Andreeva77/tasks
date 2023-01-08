package massivii;

import java.util.Scanner;

import static java.util.Arrays.deepToString;

public class Massivii {

    // Заполнить массив из 10 элементов значениями, которые мы бы вводили
    // с клавиатуры в ходе выполнения программы
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 10 чисел");
        for(int i = 0; i < 10; i++) { // Как заполнить массив
            array[i] = sc.nextInt();
        }

        System.out.println("ВВедите номер элемента массива для поиска квадратного корня");
        System.out.println("Квадратный корень =" + sqrt(sc.nextInt())); // Вызываем функцию от введенного,
        // то есть от того что мы считываем
        //System.out.println("Квадратный корень =" + sqrt(array[sc.nextInt()]);  //Считаем из массива

        System.out.println("ВВедите два номера элементов массива для поиска ср арифметического");
        System.out.println("Ср арифметическое =" + avg(sc.nextInt(), sc.nextInt()));

        for(int i = 0; i <10; i++) {    // Как вывести массив 1 способ
            System.out.print(array[i] + ", ");
        }

        //System.out.println(deepToString(array));
    }

    public static double sqrt(int element) {  //Посчитаем квадратный корень из любого элемента массива
        return Math.sqrt(element);
    }

    public static double avg(int elements1, int elements2) { // Посчитаем среднее арифметическое
        return (elements1 + elements2) / 2.0;
    }

}


































