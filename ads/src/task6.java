import java.util.Scanner;

public class task6 {
    // Complexity: O(log N)
    public static double computePower(double number, int power) {
        if (power == 0) return 1;
        double temp = computePower(number, Math.abs(power) / 2);
        if (power % 2 == 0) return power > 0 ? temp * temp : 1 / (temp * temp);
        else return power > 0 ? number * temp * temp : 1 / (number * temp * temp);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter power: ");
        int exponent = scanner.nextInt();

        System.out.println(computePower(base, exponent));

        scanner.close();
    }
}
