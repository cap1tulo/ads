import java.util.Scanner;

public class task10 {
    // Complexity: O(log(min(a, b)))
    public static int computeGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return computeGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int first = scanner.nextInt();
        System.out.print("Input second number: ");
        int second = scanner.nextInt();

        System.out.println("GCD is: " + computeGCD(first, second));

        scanner.close();
    }
}
