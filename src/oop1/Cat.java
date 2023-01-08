package oop1;

public class Cat {

    // Поля
    private String name;  // Равен null
    int age;   // Равен null

    boolean hungry = true;

    static int count = 0;


    // Свойства. С помощью свойств set и get мы можем обращаться к переменной private
    public String getName() { // Это свойство get. Таким образом мы обращаемся к имени через свойсто.
        return name;
    }


    public void setName(String newName) {
        if (newName != "") { // Если newName не равно пустой строке, тогда мы меняем имя, а иначе не меняем
            name = newName;
        }
    }

    //  public void setName(String newName) { // Это свойство set
    //    name = newName;   // newName это тот параметр который мы передадим / Получаем имя через параметр
//}


    // Методы
    private void meow() {  // посмотрим что будет, если метод будет private
        System.out.println("Мяу "); //Метод. Когда кошка будет мяукать, в консоль будем выводить мяу
    }

    public void wantToOut() {
        System.out.println("Скребёт дверь");
        meow();
    }

    //public static void countCats() {
    //    count++;
    //  System.out.println("Создана кошка номер " + count);
   // }


    // Конструкторы

   // public Cat() {     // Так выглядит конструктор, который не принимает значений.
                      // Обычно эту запись (такого конструктора не прописывают (её скрывают)
   // }

    //public void mathod();
    //age = 234;    // В этом классе я могу поменять age, а в другом классе просто так не могу поменять
    // Чтобы поменять нужно прописать свойство



    // Новый конструктор
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }
        // Первый конструктор, который не принимает значения тоже пропишу, если хочу, чтобы он не заменился новым
    public Cat() { // Пустой конструктор
        count++;
    }

}


































