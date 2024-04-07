import java.util.Scanner;

public class task5 {
    // Complexity: O(2^N)
    public static int computeFibonacci(int index) {
        return (index < 2) ? index : computeFibonacci(index - 1) + computeFibonacci(index - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input sequence number: ");
        int sequenceNumber = scanner.nextInt();
        System.out.println(computeFibonacci(sequenceNumber));

        scanner.close();
    }
}
