import java.util.Scanner;

public class task10 {
    // Complexity: O(log(min(a, b)))
    public static int findGCD(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return findGCD(secondNumber, firstNumber % secondNumber);
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = inputScanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = inputScanner.nextInt();

        int gcdResult = findGCD(num1, num2);
        System.out.println(gcdResult);

        inputScanner.close();
    }
}
