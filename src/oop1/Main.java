package oop1;

import static oop1.Cat.count;

public class Main  {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //count++;
        cat1.age = 2;
        cat1.hungry = false;
        cat1.setName("Mimi");
        cat1.setName("");

        System.out.println("Имя кошки: " + cat1.getName());
        System.out.println("Возраст: " + cat1.age);
        System.out.println("Кошка голодная? " + cat1.hungry);
        System.out.println(); // Пустую строчку прописала, чтобы отступить

        //cat1.meow();

        cat1.wantToOut();
        System.out.println(); // Пустую строчку прописала, чтобы отступить

        // Создаём вторую кошку
        Cat cat2 = new Cat("Мурчик", 3);
        //count++;
        cat2.age = 5;
        System.out.println("Имя кошки: " + cat2.getName());
        System.out.println("Возраст: "+ cat2.age);
        System.out.println("Кошка голодная? " + cat2.hungry);

        System.out.println("\nЧисло кошек: " + count);
    }
}



































