import java.util.Scanner;


class Mat {
    private int result;

    public int calc(int num1, char symbol, int num2) {
        switch (symbol) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Неподдерживаемая операция");
        }
        return result;
    }
}





