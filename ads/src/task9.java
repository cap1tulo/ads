import java.util.Scanner;

public class task9 {
    // Complexity: O(N * K)
    public static int calculateBinomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return calculateBinomial(n - 1, k - 1) + calculateBinomial(n - 1, k);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = scanner.nextInt();
        System.out.print("Enter k value: ");
        int k = scanner.nextInt();
        System.out.println("Binomial Coefficient: " + calculateBinomial(n, k));
        scanner.close();
    }
}
