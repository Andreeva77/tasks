package dinamicheskie_strukturiDannih;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>(); // Создадим список, который называется list

        // Если не знаем до каких пор считыва, то цикл while
        while (sc.hasNextInt()) {
            set.add(sc.nextInt()); // В лист со сканера считывать

        }
        System.out.println(set);

        //В терминал вводим чмсла, а когда хотим закончить, то вводим букву

    }
}
