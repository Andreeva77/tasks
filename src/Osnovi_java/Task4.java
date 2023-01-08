package Osnovi_java;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a > Math.abs(b)) {
            a /= 2; // a = a / 2
        }
        System.out.println("a = "+ a);
    }
}
