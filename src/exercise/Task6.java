package exercise;

public class Task6 {
    // Напечатать таблицу соответствия между весом в фунтах и весом в килограммах
    // для значений 1, 2,...10 фунтов (1 фунт = 453 г)
    public static void main(String[] args) {
        double weight = 0;
        for (int i = 1; i <= 10; i++) {
            weight = i * 0.453;
            System.out.println(i + " pounds = " + weight + " kg");
        }
    }
}
