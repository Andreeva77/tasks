package Osnovi_java;

public class Task7 {

    // 1. Напечатать числа в виде следующей таблицы:
    //  5 5 5 5 5 5
    //  5 5 5 5 5 5
    //  5 5 5 5 5 5
    //  5 5 5 5 5 5
    public static void main(String[] args) {
        int number = 12;
        printNumberToLine(2);
        printNumberToLine(3);
        printNumberToLine(5);
        printNumberToLine(5+2);
        printNumberToLine(number);
    }

    public static void printNumberToLine(int a) {
        System.out.printf("%d %d %d %d %d %d\n", a, a, a, a, a, a);
    }
}
