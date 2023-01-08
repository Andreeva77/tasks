package oop2.zoo;

import java.sql.SQLOutput;

public class Animal {
    // Кусаются и могут болеть
    boolean healthy;

    String name;

    String cage = "В вольере";

    public void bite(Human human) { // в параметрах передали объект(human)  класса(human)
        human.hurt = true;
        System.out.println("Животное укусило" + human.profession);

    }
}


























