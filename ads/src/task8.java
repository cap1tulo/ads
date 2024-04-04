import java.util.Scanner;

public class task8 {
    // Complexity: O(N)
    public static void validateNumericString(String input) {
        int nonDigitCount = 0;
        for (int index = 0; index < input.length(); index++) {
            if (!Character.isDigit(input.charAt(index))) {
                nonDigitCount++;
            }
        }
        if (nonDigitCount == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String str = inputScanner.nextLine();
        validateNumericString(str);
        inputScanner.close();
    }
}
