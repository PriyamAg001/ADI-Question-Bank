package ADI_ETE;

import java.util.*;

public class CountingBits {
    public static int solve(int n, int[] dp) {
        // Base Case:
        if(n == 0){
            return dp[0] = 0;
        }
        if(n == 1){
            return dp[1] = 1;
        }

        // Look-up in dp table:
        if(dp[n] != -1){
            return dp[n];
        }

        // Recurrence relation:
        if(n % 2 == 0){
            return dp[n] = solve(n/2, dp);
        } else {
            return dp[n] = 1 + solve(n-1, dp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];  // Include 'n' in the array
        Arrays.fill(dp, -1);

        for(int i=0; i<=n; i++){  // Include 'n' in the loop
            solve(i, dp);
        }

        // Print the dp array
        for(int i=0; i<=n; i++){
            System.out.print(dp[i] + " ");
        }
    }
}
