package ADI_ETE;

import java.util.Scanner;
public class LargestIndex {
    public static void findLargestIndex(int[] arr) {
        int[] index = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            index[i] = i;
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length - i - 1; j++){
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    temp = index[j];
                    index[j] = index[j+1];
                    index[j+1] = temp;
                }
            }
        }
        for(int idx : index){
            System.out.print(idx + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        findLargestIndex(arr);
    }
}
