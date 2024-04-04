import java.util.Scanner;

public class task7 {
    // Complexity: O(N!)
    public static void generatePermutations(String remaining, String combination) {
        int length = remaining.length();
        if (length == 0) {
            System.out.println(combination);
        } else {
            for (int i = 0; i < length; i++) {
                generatePermutations(remaining.substring(0, i) + remaining.substring(i + 1), combination + remaining.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Input a string to permute: ");
        String inputString = inputReader.nextLine();
        generatePermutations(inputString, "");
        inputReader.close();
    }
}
