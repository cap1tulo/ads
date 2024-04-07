import java.util.Scanner;

public class task4 {
    // Complexity: O(N)
    public static int findFactorial(int n) {
        return (n > 1) ? n * findFactorial(n - 1) : 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(findFactorial(num));

        scanner.close();
    }
}
