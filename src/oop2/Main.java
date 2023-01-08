package oop2;

public class Main {
    public static void main(String[] args) {
        Human human = new Human(); // Создаем обект класса Human (где Human - тип данных, new Human - конструктор)

        human.age = 24;
        human.name = "Илья";
        System.out.println("Имя: " + human.name + "\n Возраст: " + human.age);
        human.eat(); // вызываем метод human
        human.sleep();


        Dog dog = new Dog();
        dog.name = "Шарик";
        System.out.println("\nИмя собаки: " + dog.name);
        dog.sleep();
        dog.bark();
        dog.eat();
        dog.bite();

     /*   Animal animal = new Animal();
        animal.eat();  Что я могу сделать с animal. Те же самые методы eat() и sleep() */

        Doctors doctor = new Doctors(); // Создаём обычный объект через конструктор
        doctor.name = "Dr. Watson";
        doctor.age = 23;
        System.out.println("\nИмя: " + doctor.name + "\n Возраст: " + doctor.age);
        doctor.eat();
        doctor.sleep();

        Tool tool = new Tool();
        System.out.println(); // Перенос строки
        tool.bite();   // у объекта tool есть метод bite
    }
}
































