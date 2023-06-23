import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();

        // Заполняем массив случайными значениями
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // Генерируем случайное число от 0 до 99
        }

        // Находим среднюю арифметическую всех элементов
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;

        System.out.println("Средняя арифметическая: " + average);

    }
}