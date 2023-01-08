package oop2.zoo;

public class Main {
    public static void main(String[] args) {
        Veterinar veterinar = new Veterinar(); // Создадим ветеринара с помощью обычного конструктора
        Zookeeper zookeeper = new Zookeeper();

        veterinar.lunch(); // Вызываем от объекта матод lunch
        zookeeper.lunch();

        veterinar.hungry = true;
        veterinar.lunch();

        zookeeper.hurt = true;
        zookeeper.makeBandage();

        // Создадим объекты
        Cats lion = new Cats();
        Cats tiger = new Cats();
        Hypo hypo = new Hypo();
        Squirrels squirrelsS = new Squirrels();
        Squirrels squirrelsL = new Squirrels();

        // Что объекты умеют делать
        System.out.println(zookeeper.hurt);
        lion.bite(zookeeper); // лев покусал смотрителя
        System.out.println(zookeeper.hurt);

        squirrelsL.goOut();
        veterinar.watch(squirrelsL);
    }
}



























