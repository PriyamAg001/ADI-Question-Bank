package ADI_ETE;

import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static int solve(int[] arr, int size, int curr, int prev, int[][] dp) {
        // Base Case:
        if(curr == size){
            return 0;
        }

        // Step 3:
        if(dp[curr][prev+1] != -1){
            return dp[curr][prev+1];
        }

        // Step 2:
        // Include (Take Case):
        int take = 0;
        if(prev == -1 || arr[curr] > arr[prev]){
            take = 1 + solve(arr, size, curr+1, curr, dp);
        }
        // Exclude (Not Take Case):
        int notTake = solve(arr, size, curr+1, prev, dp); // Corrected line

        dp[curr][prev+1] = Math.max(take, notTake);
        return dp[curr][prev+1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int size = arr.length;

        // Step 1: Create DP:
        int[][] dp = new int[n][n+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[i].length; j++){
                dp[i][j] = -1;
            }
        }

        System.out.print(solve(arr, size, 0, -1, dp));
    }
}