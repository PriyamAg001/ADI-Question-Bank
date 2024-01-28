package ADI_ETE;

import java.util.Scanner;

public class SymmetricNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower limit:");
        int low = scanner.nextInt();
        System.out.println("Enter the upper limit:");
        int high = scanner.nextInt();
        scanner.close();

        int result = countSymmetricNumbers(low, high);
        System.out.println("The number of symmetric numbers is: " + result);
    }

    public static int countSymmetricNumbers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (isSymmetric(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isSymmetric(int num) {
        String s = Integer.toString(num);
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n / 2; i++) {
            sum1 += s.charAt(i) - '0';
            sum2 += s.charAt(n - 1 - i) - '0';
        }
        return sum1 == sum2;
    }
}
