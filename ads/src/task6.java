import java.util.Scanner;

public class task6 {
    // Complexity: O(log N)
    public static double calculateExponent(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return base * calculateExponent(base, exponent - 1);
        } else {
            return 1 / calculateExponent(base, -exponent);
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Input the base value: ");
        double baseValue = inputScanner.nextDouble();
        System.out.print("Input the exponent value: ");
        int exponentValue = inputScanner.nextInt();

        double exponentResult = calculateExponent(baseValue, exponentValue);
        System.out.println(exponentResult);

        inputScanner.close();
    }
}
