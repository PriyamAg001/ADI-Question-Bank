package ADI_ETE;

import java.util.Scanner;

public class ReducingTargetNumberToZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the target number:");
        int target = scanner.nextInt();

        int result = numberOfSteps(target);
        System.out.println("The number of steps to reduce the target to zero is: " + result);
    }

    public static int numberOfSteps(int target) {
        int steps = 0;
        for(int i=0; i<target; i++) {
            while (target != 0) {
                if (target % 2 == 0) {
                    target /= 2;
                } else {
                    target -= 1;
                }
                steps++;
            }
        }
        return steps;
    }
}
