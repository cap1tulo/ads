import java.util.Scanner;

public class task4 {
    // Complexity: O(N)
    public static int calculateFactorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.print("Input a number for factorial calculation: ");
        int number = inputReader.nextInt();
        int factorialOfNumber = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorialOfNumber);

        inputReader.close();
    }
}
