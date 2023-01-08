package Osnovi_java;

public class Task11 {
   // Даны стороны двух треугольников.
    //Найти сумму их периметров и сумму их площадей
    // Определить процедуру для расчёта периметра и площади треугольника по его сторонам.

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        int a1 = 3;
        int b1 = 4;
        int c1 = 5;

        int p = perimetr(a, b, c);        //Вызываем функцию периметр
        int p1 = perimetr(a1, b1, c1);
        System.out.println("P = " + p);
        System.out.println("P1 = " + p1);

        //   int                   // Результат функции запишем в переменyю площадь.
        //   Хотя результат нам не так важен, так как он не будет тмпользоваться нигде,
        //   поэтому будем сразу выводить его и вызывать функцию прямо в выводе
       // System.out.println("S = " + square(p, a, b, c));   //Вызываем функцию square от периметра,
                                                           // от а, b, с

        double s = square(p, a, b, c);
        double s1 = square(p, a1, b1, c1);
        System.out.println("S = " + square(p, a, b, c));   // Тоже самое для 2-го треугольника
        System.out.println("S1 = " + square(p1, a1, b1, c1));

        System.out.println("Сумма периметров =  " + (p + p1));           //Выводим сумму периметров
        System.out.println("Сумма площадей =  " + (s +s1));
    }

    public static int perimetr(int a, int b, int c) {
        return a + b + c;
    }

    public static double square(int p, int a, int b, int c) {
        int pp = p/2;
        return Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c));
    }
}




























