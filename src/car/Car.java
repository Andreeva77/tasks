package car;

public class Car {

    // Создайте атрибуты класса Car - color (цвет), type (тип), year (год).
    private String color;
    private String type;
    private int year;

    //Нужно написать 5 методов
    // Первый - запуск автомобиля, при его вызове выводится сообщение "Автомобиль заведён."
    public void start() {

        System.out.println("Автомобиль заведён");
    }

    // Написать второй метод - отключение автомобиля - выводит сообщение "Аатомобиль заглушен."
    public void stop() {

        System.out.println("Автомобиль заглушен");
    }

    // Написать - третий метод - присвоение автомобилю года выпуска.
    public void setYear(int year) {

        this.year = year;
    }

    public int getYear() {

        return year;
    }

    // Написать четвертый метод - присвоение автомобилю типа.
    public void setType(String type) {

        this.type = type;
    }

    public String getType() {

        return type;
    }

    // Написать пятый метод - присвоение автомобилю цвета.
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Перый конструктор
    public Car() {

    }

    // Второй конструктор
    public Car(String color, String type, int year) {
        this.color = color;
        this.type = type;
        this.year = year;
    }
}




































