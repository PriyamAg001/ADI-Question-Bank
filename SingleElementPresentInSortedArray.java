package ADI_ETE;

import java.util.*;

public class SingleElementPresentInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArray = sc.nextLine().split(" ");
        int n = inputArray.length;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(inputArray[i]);
        }

        int result = solve(arr, n);
        System.out.println(result);
    }

    private static int solve(int[] arr, int n) {
        int low = 0;
        int high = n - 1;

        while(low < high){
            int mid = low + (high - low) / 2;

            if(mid % 2 == 1){
                mid--;
            }

            if(arr[mid] != arr[mid + 1]){
                high = mid;
            }
            else{
                low = mid + 2;
            }
        }
        return arr[low];
    }
}
