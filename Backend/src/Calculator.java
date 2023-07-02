public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.calculate(5, 2, '+');
        System.out.println("Result: " + result);
    }

    public int calculate(int num1, int num2, char operator) {
        int result = 0;
        switch (operator) {
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
                System.out.println("Invalid operator");
        }
        return result;
    }
}