package oop2.zoo;


// 1 Кормит всех животных
// 2 Вычесывает представителей кошачьих
// 3 Меняет бегемоту воду


public class Zookeeper extends Human {

    @Override
    void lunch() {
        if (hungry ==true) {
            System.out.println("Смотритель пообедал");
            hungry = false;
        } else {
            System.out.println("Смотритель ещё не голоден");
        }
    }

    @Override
    void watch(Squirrels squrrels) {
        if (squrrels.cage == "вне вольера") {
            System.out.println("Белка поймана");
            squrrels.cage = "в вольере";
        } else {
            System.out.println("Белка на месте");
        }
    }

    @Override
    void makeBandage() {
        if (hurt ==true) {
            System.out.println("Смотритель наложил повязку");
            hurt = false;
        } else {
            System.out.println("Смотритель не кусали");
        }
    }

    public Zookeeper() {
        profession = "Смотритель";
    }
}































