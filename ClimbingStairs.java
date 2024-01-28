package ADI_ETE;

import java.util.Scanner;

public class ClimbingStairs {
    public static int climbingStairs(int n) {
//      Base Case:
        if (n==0 || n==1) {
            return 1;
        }

        int prev = 1;
        int curr = 1;
        for(int i=2; i<=n; i++){
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(climbingStairs(n));
    }
}
