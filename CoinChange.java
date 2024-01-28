package ADI_ETE;

import java.util.*;

public class CoinChange {
    public static int solve(int[] coins, int target, int[] dp) {
//        Base Case:
        if(target == 0){
            return 0;
        }
        if(target < 0){
            return Integer.MAX_VALUE;
        }

//        Step 3:
        if(dp[target] != -1){
            return dp[target];
        }

//        Step 2:
        int mini = Integer.MAX_VALUE;
        for(int i=0; i<coins.length; i++){
            int ans = solve(coins, target - coins[i], dp);
            if(ans != Integer.MAX_VALUE){
                mini = Math.min(mini, ans + 1);
            }
        }
        dp[target] = mini;
        return mini;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for(int i=0; i<n; i++){
            coins[i] = sc.nextInt();
        }

        int target = sc.nextInt();

//        Step 1: Create DP
        int[] dp = new int[target + 1];
        Arrays.fill(dp, -1);

        int ans = solve(coins, target, dp);
        if(ans == Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(ans);
        }
    }
}
