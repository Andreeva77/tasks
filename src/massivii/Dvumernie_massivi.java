package massivii;

import java.util.Random;

public class Dvumernie_massivi {

    // Дан двумерный массив
    // 1 Вывести на экран элемент. который расположен в правом верхнем углу массива
    // 2 Вывести на экран элемент, расположенный в левом нижнем углу массива

    public static void main(String[] args) {
        // Создадим рандом
        Random r = new Random();

        // Создадим двумерный массив
        int[][] array2d = new int[r.nextInt(2, 5)][r.nextInt(2, 5)];

        // Выводим. Как это будет выглядеть в цикле.
        for (int i = 0; i < array2d.length; i++) { // обращаемся ко всему массиву
            for (int j = 0; j < array2d[i].length; j++) { //Проходимся по всем элементам, то есть по влоенным массивам
                array2d[i][j] = r.nextInt(20);  // Заполним массив любыми числами до 20
                System.out.print(array2d[i][j] + " ");  //Выводим все элементы одного массива
            }
            System.out.println(); // Пропуск строки
        }
        System.out.println("Правый верхний угол " + array2d[0][array2d[0].length-1]);
        System.out.println("Левый нижний угол " + array2d[array2d.length-1][0]);
    }
}


// [ [1,2], [2,3,4,7], [1,2,3], [1] ]    Длина массива 4 элемента. А у элементов внутри своя длина.
// У первого - 2 элемента
// У второго массива - 4 элемента внутри
// У третьего - 3 элемента
// У четвертого - 1 элемент
// смотри 50: 50 видео про массивы
































