package ADI_ETE;

import java.util.Scanner;

public class LongestCommonSubsequence {
    public static int solve(String text1, String text2, int i, int j, int[][] dp) {
//        Base Case:
        if(i == text1.length() || j == text2.length()) {
            return 0;
        }

        // Step 3:
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int ans;
        // Step 2:
        if(text1.charAt(i) == text2.charAt(j)){
            ans = 1 + solve(text1, text2, i+1, j+1, dp);
        }
        else{
            ans = Math.max(solve(text1, text2, i+1, j, dp), solve(text1, text2, i, j+1, dp));
        }
        dp[i][j] = ans;
        return dp[i][j];


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.next();
        String text2 = sc.next();

        int n = text1.length();
        int m = text2.length();

        // Step 1: Create DP:
        int[][] dp = new int[n][m];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.print(solve(text1, text2, 0, 0, dp));
    }
}
