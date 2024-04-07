import java.util.Scanner;

public class task8 {
    // Complexity: O(N)
    public static boolean isNumeric(String str, int index) {
        if (index == str.length()) {
            return true;
        }
        if (!Character.isDigit(str.charAt(index))) {
            return false;
        }
        return isNumeric(str, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter: ");
        String input = scanner.nextLine();

        System.out.println(isNumeric(input, 0) ? "Yes" : "No");

        scanner.close();
    }
}
