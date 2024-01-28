package ADI_ETE;

public class DifferenceInASCIICodes {
    public static void main(String[] args) {
        String s = "A12$"; // replace with your input
        System.out.println(insertDifference(s));
    }

    public static String insertDifference(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            sb.append(c1);
            sb.append((int) (c2 - c1));
        }
        sb.append(s.charAt(s.length() - 1));
        return sb.toString();
    }
}
