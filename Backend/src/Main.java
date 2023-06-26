import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        
        double average = 0;
        for (int number : numbers) {
            average += number;
        }
        average /= numbers.length;
        
        int targetNumber = numbers[random.nextInt(numbers.length)];
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targetNumber) {
                index = i;
                break;
            }
        }
        
        System.out.println("Средняя арифметическая: " + average);
        System.out.println("Порядковый номер числа " + targetNumber + ": " + index);
    }
}
