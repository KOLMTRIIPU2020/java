

public class Main {
    public static void main(String[] args) {
        int min = -150;
        int max = 20;

        // Генерация случайного числа в промежутке от min до max
        int randomNumber = (int) Math.round(Math.random() * (max - min) + min);

        System.out.println("Случайное число: " + randomNumber);
    }
}