import java.util.Scanner;

public class task3 {
    // Complexity: O(sqrt(N))
    private static boolean isPrimeHelper(int number, int divisor) {
        if (number <= 1) {
            return false;
        } else if (divisor * divisor > number) {
            return true;
        } else if (number % divisor == 0) {
            return false;
        } else {
            return isPrimeHelper(number, divisor + 1);
        }
    }

    public static boolean isPrime(int number) {
        return isPrimeHelper(number, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
