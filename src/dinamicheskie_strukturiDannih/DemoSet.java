package dinamicheskie_strukturiDannih;

import java.util.HashSet;

public class DemoSet {
    public static void main(String[] args) {
        HashSet<String> mySet = new HashSet<>(); //В set хранятся уникальные значение, повторов не может быть
        mySet.add("Window");
        mySet.add("Door");
        mySet.add("House");

        mySet.remove("Door");  // Удалим значение
        mySet.add("Door");    // Запишем значение

        System.out.println(mySet);
    }
}
