package oop2.zoo;


// 1 обходит каждое животное и проверяет его здоровье
// 2 помещает на карантин, изолируя от других животных
// 3 Возвращает животное в обычный вольер


public class Veterinar extends Human{

    @Override
    void lunch() {
        if (hungry ==true) {
            System.out.println("Ветеринар пообедал");
            hungry = false;
        } else {
            System.out.println("Ветеринар ещё не голоден");
        }
    }




    @Override
    void makeBandage() {
        if (hurt ==true) {
            System.out.println("Ветиренар наложил повязку");
            hurt = false;
        } else {
            System.out.println("Ветиренар не кусали");
        }
    }
// Передаем экземпляр класса animal
    public void checkHealth(Animal animal) {
        if (!animal.healthy) {  // Проверка. Если животное не здорово, тогда мы помещаем в карантин
            animal.cage = "Заболело";
            System.out.println("Такое то животное заболело и его поместили в карантин");
        }
        if (animal.cage == "в карантине" && animal.healthy == true) {
            animal.cage = "Выздоровело";
            System.out.println("Животное выздоровело, вернули в вольер");
        }
    }

  /*  public void returnFromIsolation(Animal animal) {
        animal.cage = "Выздоровело";
        System.out.println("Животное выздоровело, вернули в вольер");
    }  */
    public Veterinar() {
        profession = "Ветеринар";
    }
}






























