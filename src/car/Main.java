package car;

public class Main {

    public static void main(String[] args) {
        // Создаём первую машину с помощью пустого конструктора
        Car car1 = new Car();

        // Создаём вторую машину с помощью непустого конструктора, то есть мы должны передать цвет, тип, год выпуска
        Car car2 = new Car("Красный", "Седан", 2010);

        // Проверим для первой машины методы set
        car1.setColor("Жёлтый");
        car1.setType("Грузовик");
        car1.setYear(2000);

        System.out.println("Машина номер 1");
        System.out.println("Цвет машины:" + car1.getColor());
        System.out.println("Тип машины:" + car1.getType());
        System.out.println("Год выпуска машины:" + car1.getYear());

        car1.start();
        car1.stop();
        car1.start();


        System.out.println("\nМашина номер 2");
        System.out.println("Цвет машины:" + car2.getColor());
        System.out.println("Тип машины:" + car2.getType());
        System.out.println("Год выпуска машины:" + car2.getYear());

        car2.start();
        car2.stop();
    }
}













