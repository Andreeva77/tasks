package Osnovi_java;

public class Task9 {

    // Напечатать числа в виде следующей таблицы:
    // 5
    // 5 5
    // 5 5 5
    // 5 5 5 5
    // 5 5 5 5 5

    public static void main(String[] args) {
        // 1 способ решения без функции
      //  printToPeramid(5);          //Одну строчку вывести
      //  System.out.println();       // Одну строчку пропустить
      //  printToPeramid(5);          //Две строчки  вывести
      //  printToPeramid(5);
      //  System.out.println();       // Одну строчку пропустить
      //  printToPeramid(5);          // Три строчки  вывести
      //  printToPeramid(5);
      //  printToPeramid(5);
        printToPeramid(5, 1);
        System.out.println();         // Одну строчку пропустить
        printToPeramid(3, 2);
        System.out.println();         // Одну строчку пропустить
        printToPeramid(2+4, 3);
        System.out.println();         // Одну строчку пропустить
        printToPeramid(5-1, 4);
        System.out.println();         // Одну строчку пропустить
        printToPeramid(0, 5);
    }

    public static void printToPeramid(int number, int count) {
        if(count > 0) {
            count--;                            // count мы уменьшили на один
            System.out.print(number + " ");     // Вывести число с пробелом
            printToPeramid(number, count);      // и ещё раз обратиться (вызвать эту функцию)
        }
    }
}







































