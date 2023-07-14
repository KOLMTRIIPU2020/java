import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int factorial = calculate.calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равно " + factorial);
    }}