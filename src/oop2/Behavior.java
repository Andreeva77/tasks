package oop2;

public interface Behavior {
    default void bite() {
        System.out.println("Кусать");
    }
}
