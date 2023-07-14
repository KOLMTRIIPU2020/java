import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        char symbol = scanner.next().charAt(0);
        int num2 = scanner.nextInt();

        Mat mat = new Mat();

        int result = mat.calc(num1, symbol, num2);

        System.out.println("Результат: " + result);
    }
}