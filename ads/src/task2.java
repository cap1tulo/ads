import java.util.Scanner;

public class task2 {
    // Complexity: O(N)
    public static float computeAverage(int count, int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("The input array is empty.");
            return 0;
        }
        float total = 0;
        for (int i = 0; i < count; i++) {
            total += numbers[i];
        }
        return total / count;
    }
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int size = inputScanner.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            nums[i] = inputScanner.nextInt();
        }
        float avgValue = computeAverage(size, nums);
        System.out.println(avgValue);

        inputScanner.close();
    }
}
