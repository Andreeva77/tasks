package Osnovi_java;

public class Task1 {

    //С некоторого момента прошло 234 дня. Сколько прошло полных недель за этот период? А сколько месяцев?
    public static void main(String[] args) {
        int days = 234;
        int weeks = days / 7;
        int months = days / 30;

        System.out.println("Количество недель =  " + weeks);
        System.out.println("Количество месяцеы =  " + months);
    }
}
