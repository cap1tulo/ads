import java.util.Scanner;

public class task2 {
    // Complexity: O(N)
    public static double computeAverage(int[] sequence, int length) {
        if (length == 1) {
            return sequence[0];
        } else {
            return sequence[length - 1] + computeAverage(sequence, length - 1);
        }
    }

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Size of array: ");
        int count = inputDevice.nextInt();

        int[] numbers = new int[count];

        System.out.println("Input elements:");
        for (int i = 0; i < count; i++) {
            numbers[i] = inputDevice.nextInt();
        }

        double avg = computeAverage(numbers, count) / count;
        System.out.println(avg);

        inputDevice.close();
    }
}
