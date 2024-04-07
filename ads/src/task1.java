import java.util.Scanner;

public class task1 {
    // Complexity: O(N)
    public static int findMinimum(int[] data, int length) {
        if (length == 1) {
            return data[0];
        }
        int prevMin = findMinimum(data, length - 1);
        return Math.min(prevMin, data[length - 1]);
    }

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Input size: ");
        int size = inputReader.nextInt();

        int[] values = new int[size];

        System.out.print("Fill the array: ");
        for (int i = 0; i < size; i++) {
            values[i] = inputReader.nextInt();
        }

        int smallestValue = findMinimum(values, size);
        System.out.println(smallestValue);

        inputReader.close();
    }
}
