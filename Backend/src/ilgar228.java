import javax.swing.JOptionPane;

public class ilgar228 {

        public static void main(String[] args) {
            int size = Integer.parseInt(JOptionPane.showInputDialog("Введите размер:"));

            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * 1000) + 1;
            }

            int totalElements = array.length;
            int evenCount = 0;
            int addCount = 0;

            for (int num : array) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    addCount++;
                }
            }

            JOptionPane.showMessageDialog(null,
                    "Колво всех элементов: " + totalElements + "\n" +
                            "Колво четных чисел: " + evenCount + "\n" +
                            "Колво нечетных чисел: " + addCount);
        }
}





