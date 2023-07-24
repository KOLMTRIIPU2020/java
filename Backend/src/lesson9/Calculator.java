package lesson9;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /, ^, sqrt): ");
        String operator = scanner.next();

        double result;

        if (operator.equals("^")) {
            System.out.print("Введите степень: ");
            double power = scanner.nextDouble();
            result = Math.pow(num1, power);
        } else if (operator.equals("sqrt")) {
            result = Math.sqrt(num1);
        } else {
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Неверная операция");
                    return;
            }
        }

        System.out.println("Результат: " + result);
        }
}
