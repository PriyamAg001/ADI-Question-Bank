package ADI_ETE;
import java.util.*;
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.println("Enter a number N:");
        int N = scanner.nextInt();

        // Find and print prime factors
        findAndPrintPrimeFactors(N);
    }

    private static void findAndPrintPrimeFactors(int N) {
        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                // i is a prime factor of N
                System.out.print(i + " ");
                N /= i;
            }
        }
    }
}
