package ADI_ETE;

import java.util.Scanner;

public class OddEvenCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        String result = replaceCharacters(s);
        System.out.println("The resulting string is: " + result);
    }

    public static String replaceCharacters(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            if (c % 2 == 0) {
                sb.append((char) (c + 1));
            } else {
                sb.append((char) (c - 1));
            }
        }
        return sb.toString();
    }
}
