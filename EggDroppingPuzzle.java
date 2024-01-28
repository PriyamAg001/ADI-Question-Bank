package ADI_ETE;
import java.util.*;
public class EggDroppingPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] dp = new int[K+1][N+1];
        for(int i=1; i<=K; i++){
            for(int j=1; j<=N; j++){
                dp[i][j] = j;
                for(int k=1; k<j; k++){
                    dp[i][j] = Math.min(dp[i][j], 1 + Math.max(dp[i-1][k-1], dp[i][j-k]));
                }
            }
        }
        System.out.println(dp[K][N]);
    }
}
