package Osnovi_java;

public class Task2 {
    //2.
    public static void main(String[] args) {
        int number = 39;
        int decimals = number / 10;
        int units = number % 10;
        int sum = decimals + units;
        int product = decimals + units;

        System.out.printf(
                "Количество десятков - %d, количество единиц - %d\nСумма цифр -%d, произведение цифр - %d",
                decimals,
                units,
                sum,
                product
            );

    }
}
