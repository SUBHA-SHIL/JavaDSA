package ArrayAdv;

import java.util.Arrays;
import java.util.Scanner;

public class sumOfPos_Neg {
    static int[] sum(int[] arr) {
        int positiveSum = 0;
        int negativeSum = 0;
        for (int j : arr) {
            if (j < 0) {
                negativeSum += j;
            }
            else
                positiveSum += j;
        }
        return new int[]{positiveSum, negativeSum};
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<arr.length; i++) {
            System.out.println("Enter " + i + "th term: ");
            arr[i] = sc.nextInt();
        }
        int[] results = sum(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of positive numbers: " + results[0]);
        System.out.println("Sum of negative numbers: " + results[1]);
    }
}
