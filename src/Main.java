import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        System.out.println("Елементи масиву: " + Arrays.toString(array));

        int negativeSum = 0;
        for (int num : array) {
            if (num < 0) {
                negativeSum += num;
            }
        }
        System.out.println("Сума від'ємних чисел: " + negativeSum);

        int evenCount = 0;
        int oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);

        int min = array[0];
        int max = array[0];
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");

        int firstNegativeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex == -1) {
            System.out.println("Від'ємних чисел немає.");
        } else {
            int sumAfterFirstNegative = 0;
            int countAfterFirstNegative = 0;
            for (int i = firstNegativeIndex + 1; i < array.length; i++) {
                sumAfterFirstNegative += array[i];
                countAfterFirstNegative++;
            }
            double averageAfterFirstNegative = (double) sumAfterFirstNegative / countAfterFirstNegative;
            System.out.println("Середнє арифметичне чисел після першого від'ємного числа: " + averageAfterFirstNegative);
        }
    }
}
