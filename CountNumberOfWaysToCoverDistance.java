package ADI_ETE;

import IMPT_QUES.Array_Square;

import java.util.*;

public class CountNumberOfWaysToCoverDistance {
    public static int solve(int n, int[] dp) {
//        Base Case:
        if(n == 0){
            return dp[0] = 1;
        }
        if(n == 1){
            return dp[1] = 1;
        }
        if(n == 2){
            return dp[2] = 2;
        }

//        Step 3:
        if(dp[n] != -1){
            return dp[n];
        }

//        Step 2: RR
        int ans = 0;
        for(int i=3; i<=n; i++) {
            dp[i] = solve(i-1, dp) + solve(i-2, dp) + solve(i-3, dp);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        Step 1: Create DP
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        System.out.print(solve(n, dp));
    }
}