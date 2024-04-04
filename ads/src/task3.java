import java.util.Scanner;

public class task3 {
    // Complexity: O(sqrt(N))
    public static boolean isPrime(int number) {
        if (number <= 1) {
            System.out.println("Not eligible for prime evaluation.");
            return false;
        }
        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Input a number to check: ");
        int num = inputDevice.nextInt();

        if (isPrime(num)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

        inputDevice.close();
    }
}
