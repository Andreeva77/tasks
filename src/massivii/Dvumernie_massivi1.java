package massivii;

import java.util.Random;

public class Dvumernie_massivi1 {

    // Есть двуменрый массив. Определить
    // 1 Сумму всех элементов третьей строки массива
    // 2 Сумму всех элементов второго столбца массива

    public static void main(String[] args) {

        // Создадим рандом
        Random r = new Random();

        // Создадим двумерный массив
        int[][] array2d = new int[r.nextInt(4, 6)][r.nextInt(3, 6)];

        // Выводим. Как это будет выглядеть в цикле.
        for (int i = 0; i < array2d.length; i++) { // обращаемся ко всему массиву
            for (int j = 0; j < array2d[i].length; j++) { //Проходимся по всем элементам, то есть по влоенным массивам
                array2d[i][j] = r.nextInt(20);  // Заполним массив любыми числами до 20
                System.out.print(array2d[i][j] + " ");  //Выводим все элементы одного массива
            }
            System.out.println(); // Пропуск строки
        }
        int sumRow = 0;
        // Сумма всех элеменов 3-ей строки массива. Нужен цикл, потому что надо пройтись по всем
        // элементам этой строки и посчитать сумму (i++ - проходимся по каждому элементу)
        for (int i = 0; i < array2d[3].length; i++) {
            sumRow += array2d[3][i];
        }

        System.out.println("Sum = " + sumRow);

        int sumCol = 0;
        // Сумма всех элеменов 3-ей строки массива. Нужен цикл, потому что надо пройтись по всем
        // элементам этой строки и посчитать сумму (i++ - проходимся по каждому элементу)
        for (int i = 0; i < array2d.length; i++) {
            sumCol += array2d[i][2];
        }
        System.out.println("Sum = " + sumCol);

    }
}

























