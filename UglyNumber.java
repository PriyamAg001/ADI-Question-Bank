package ADI_ETE;

import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // replace with your input
        System.out.println(isUgly(n));
    }

    public static boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        while((n%2==0 || n%3==0 || n%5==0)){
            if(n%3 == 0)
                n = n/3;
            if(n%2 == 0)
                n = n/2;
            if(n%5 == 0)
                n = n/5;

        }
        return n==1;
    }
}
