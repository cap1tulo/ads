import java.util.Scanner;

public class task1 {
    // Complexity: O(N)
    public static int findSmallest(int size, int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("The array does not contain any elements.");
            return Integer.MAX_VALUE;
        }

        int smallest = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = inputScanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Input the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = inputScanner.nextInt();
        }

        int smallestNumber = findSmallest(size, numbers);
        System.out.println(smallestNumber);

        inputScanner.close();
    }
}
