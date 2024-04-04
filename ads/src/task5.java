import java.util.Scanner;

public class task5 {
    // Complexity: O(2^N)
    public static int fibonacci(int sequenceIndex) {
        if (sequenceIndex <= 1) {
            return sequenceIndex;
        }
        return fibonacci(sequenceIndex - 1) + fibonacci(sequenceIndex - 2);
    }
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a position: ");
        int position = inputScanner.nextInt();
        int fibonacciNumber = fibonacci(position);
        System.out.println("The Fibonacci number at position " + position + " is: " + fibonacciNumber);
        inputScanner.close();
    }
}
