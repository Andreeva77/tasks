package exercise;

import java.util.Random;
import java.util.Scanner;

public class Task2 {

    //Составить программу:
    // 1.нахождения минимального значения среди элементов любой строки двумерного массива;
    // 2.нахождения максимального значения среди элементов любого столбца двумерного массива
    public static void main(String[] args) {
                Random r = new Random();
                int[][] array2d = new int[3][4];
                for (int i = 0; i < array2d.length; i++,System.out.println() ) {
                    for (int j = 0; j < array2d[i].length; j++) {
                        array2d[i][j] = r.nextInt(0,20);
                        System.out.print(array2d[i][j] + " ");
                    }}
                System.out.println("Введите номер столбца ");
                Scanner sc = new Scanner(System.in);
                int i1 = sc.nextInt();
                int max = array2d[0][i1];
                for (int i = 0; i < array2d.length; i++) {
                    if (max < array2d[i][i1]) {
                        max = array2d[i][i1];
                    }} System.out.println("Max= " + max);
                System.out.println("Введите номер строки ");
                int j1 = sc.nextInt();
                int min = array2d[j1][0];;
                for (int j = 0; j< array2d.length+1; j++) {
                    if (min > array2d[j1][j]) {
                        min = array2d[j1][j];
                    }} System.out.println("Min= " + min);
            }}


