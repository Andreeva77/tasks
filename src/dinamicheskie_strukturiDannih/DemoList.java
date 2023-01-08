package dinamicheskie_strukturiDannih;

import java.util.ArrayList;

public class DemoList {
    public static void main(String[] args) {

        int[] array = new int[4]; // Задали массив. В нем обязательно указать сколько в нём элементов
        int[] array2 = {1, 2, 3};  // Можно задавать массив через эелементы, то есть какие элементы там будут.
                                   // Здесь длина массиыв 3. И три индекса 0, 1, 2
        array2[2] =5; // На второе место запишем значение 5

        // у нас есть массив из 3 элементов , но надо добавить четвертый.
        // Есть специальный тип данных - список
        //ArrayList<Integer> myList
       // ArrayList<Objects> myList
        ArrayList<String> myList = new ArrayList<>();  // Создали новый экземпляр класса ArrayList. Создали список
        myList.add("Apple");  // Добавим элементы в список
        myList.add("Peer");
        myList.add("Melon");
        myList.add(3,"Peach");
        myList.add(1,"Ananas"); // Конкретно на шестое место записали ананас

        System.out.println(myList); // Выведем
        System.out.println(myList.get(0)); // Конкретно выведем
        System.out.println(myList.get(3));

        myList.remove(0);
        myList.remove("Peach");

        System.out.println(myList);

        System.out.println(myList.indexOf("Melon")); // Найдем индекс

    }
}




























