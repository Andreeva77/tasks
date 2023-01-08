package dinamicheskie_strukturiDannih;

import static java.util.Arrays.deepToString;

public class Task {

    // Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5"
    // Избавиться от повторяющихся элементов
    // Вывести результат на экран
    public static void main(String[] args) {
        String exemple = "1, 2, 3, 4, 4, 5";
        char[] array = exemple.toCharArray();  // Переведем нашу строку в массив

        // Посмотрим как выглядит массив/ Выводим через цикл
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

        System.out.println(); // Пропуск строки
        // Выведем количество элементов внутри нашего массива
        System.out.println(array.length);

        // Как мы будем определять, что у нас повторяются элементы в строке
        // Возьмём цикл и пройдёмся по всему массиву, который получился, то есть до длины массива

        // Первый вариант

         char[] newArray = new char[100];

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] != array[i]) {
                    newArray[i] = array[i];  // Если число больше не повторяется , то мы записываем

                }
            }
        }
    }
}
























