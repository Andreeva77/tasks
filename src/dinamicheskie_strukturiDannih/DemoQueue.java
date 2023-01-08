package dinamicheskie_strukturiDannih;

import java.util.ArrayDeque;

public class DemoQueue {
    public static void main(String[] args) {
        ArrayDeque<Double> myQueue = new ArrayDeque<>();
        myQueue.push(0.12); // Добавляем в начало, поэтому это не очередь
        myQueue.push(0.122);
        myQueue.push(0.152);
        myQueue.push(0.132);

        myQueue.add(0.12); // Добавляет в конец, Теперь это очередь
        myQueue.add(0.13);
        myQueue.add(0.14);

        System.out.println(myQueue); // Выведем очередь

        // Извлечём кого-нибудь из очереди
    }
}
