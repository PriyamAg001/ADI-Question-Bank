package ADI_ETE;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of intervals:");
        int n = scanner.nextInt();
        int[][] intervals = new int[n][2];
        System.out.println("Enter the start and end points of each interval:");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }
        scanner.close();

        int result = eraseOverlapIntervals(intervals);
        System.out.println("The minimum number of intervals to be removed is: " + result);
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int end = intervals[0][1];
        int count = 1;

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                end = intervals[i][1];
                count++;
            }
        }

        return intervals.length - count;
    }
}

