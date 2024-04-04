import java.util.Scanner;

public class task9 {
    // Complexity: O(N * K)
    public static int calculateBinomialCoefficient(int setSize, int subsetSize) {
        if (subsetSize == 0 || subsetSize == setSize) {
            return 1;
        }
        return calculateBinomialCoefficient(setSize - 1, subsetSize - 1) + calculateBinomialCoefficient(setSize - 1, subsetSize);
    }

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.print("Input total set size: ");
        int n = inputReader.nextInt();
        System.out.print("Input subset size: ");
        int k = inputReader.nextInt();
        int coefficient = calculateBinomialCoefficient(n, k);
        System.out.println(coefficient);
        inputReader.close();
    }
}
