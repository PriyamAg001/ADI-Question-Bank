package ADI_ETE;

public class EvenOddSum {
    public static void main(String[] args) {
        int[] arr = {2,1,6,4}; // replace with your array
        int count = findSpecialElements(arr);
        System.out.println(count);
    }

    public static int findSpecialElements(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            int evenSum = 0, oddSum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    if (j % 2 == 0) {
                        evenSum += arr[j];
                    } else {
                        oddSum += arr[j];
                    }
                }
            }
            if (evenSum == oddSum) {
                count++;
            }
        }
        return count;
    }
}

