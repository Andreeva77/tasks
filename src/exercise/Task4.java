package exercise;

public class Task4 {

    //Заполнить массив из двенадцати элементов 1,2,3...12
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(i+1 + "");
        }
        System.out.println();

        // Вывести элементы массива на экран в обратном порядке
        for (int i = 0; i < 12; i++) {
            System.out.print(array.length - i + " ");
        }
    }
}



















