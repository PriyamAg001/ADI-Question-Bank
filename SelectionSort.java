package ADI_ETE;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {45, 12, 90, 65}; // replace with your array
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

            System.out.println(Arrays.toString(arr));
        }
    }
}
