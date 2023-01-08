package massivii;

import java.util.Random;

public class Massiv1 {
    // Дан массив. Определить
    // 1 Максимальный элемент
    // 2 Минимальный эдемент
    // 3 Индекс максимального элемента
    // 4 Индекс минимального элемента
    // 5 Поменять местами максимальный элемент с минимальным

    public static void main(String[] args) {
        Random r = new Random(); // Создаём рандом
        int[] array = new int[r.nextInt(4, 10)]; // Сюда сгенерирую какое то число

        for (int i = 0; i < array.length; i++) {// Заполняем рандом через цикл
            array[i] = r.nextInt(-100, 100);  // теперь просто заполняем каким то числом
        }

        for (int i = 0; i < array.length; i++) {// выводим
            System.out.print(array[i] + " ");  // теперь просто выведем
        }

        int max = array[0]; // Переменная максимума
        int min = array[0]; // Переменная минимума
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {   // Пройдёмся по каждому элементу внутри массива
            if (array[i] > max) {                 // и сравним с минимумом или максимумом
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        System.out.println("\nMax =" + max + " index = " + maxIndex);
        System.out.println("Min =" + min + " index = " + minIndex);

        array[maxIndex] = min;
        array[minIndex] = max;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}



















