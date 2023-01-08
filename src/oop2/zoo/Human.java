package oop2.zoo;

//  может быть голодным и покусаным
// 4 Обедает
// 5 Следит за белками
// 6 должен наложить себе повязку
public abstract class Human {

    boolean hungry;  // Если мы не задаем никакого значения, то изначально false, то есть не голоден
    boolean hurt;

    String profession;

    abstract void lunch();


    void watch(Squirrels squrrels) {
        if (squrrels.cage == "вне вольера") {
            System.out.println("Белка поймана");
            squrrels.cage = "в вольере";
        } else {
            System.out.println("Белка на месте");
        }
    }
    abstract void makeBandage();
}
































