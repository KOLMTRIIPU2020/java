public class Math {
    public static int sum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static int multiplication(int... numbers) {
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        return product;
    }
}