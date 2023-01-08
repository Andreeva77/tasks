package Osnovi_java;

public class Task10 {

    // Напечатать полную таблицу сложения в виде:
    // 1+1=2     1+2=3     ..... 1+9=10
    // 2+1=3     2+2=4    .......2+9=11
    // .....
    // 9+1=10    9+2=11    ......2+9=18


    public static void main(String[] args) {
        printTable(1,1);
        System.out.println();
        printTable(2,1);
        System.out.println();
        printTable(3,1);
        System.out.println();
        printTable(4,1);
        System.out.println();
        printTable(5,1);
        System.out.println();
        printTable(6,1);
        System.out.println();
        printTable(7,1);
        System.out.println();
        printTable(8,1);
        System.out.println();
        printTable(9,1);
        System.out.println();

    }
    public static void printTable(int a, int b) {
        if (b <= 9) {
            System.out.printf("%d + %d = %d  ", a, b, a + b);
            b++;
            printTable(a, b);
        }
    }
}





















