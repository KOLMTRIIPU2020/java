package Concotenations;

public class NumberConcatenation {
    public static String concatenateNumbers(int... numbers) {
        StringBuilder sb = new StringBuilder();

        for (int num : numbers) {
            sb.append(num);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(concatenateNumbers(1, 5, 7, 3));  // Output: 1573
        System.out.println(concatenateNumbers(5, 7));        // Output: 57
    }
}

//concotenations я английский хорошо знаю поэтому название страшное