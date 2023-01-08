package exercise;

import java.util.Scanner;

public class Task7 {

    // Вычислить сумму 1/1 + 1/2 + 1/3 +..... + 1/n
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");

        int n = sc.nextInt();

        double sum = 0;  // формула:  Sum(n) = n * (a1 + an) / 2

        for(double i = 1; i <= n; i++) {
            //System.out.println(1/i);
        }
        System.out.println(((1 + 1/n)/2.0)*n);
    }
}






















