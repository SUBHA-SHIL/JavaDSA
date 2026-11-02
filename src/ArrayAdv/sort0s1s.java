package ArrayAdv;

import java.util.Arrays;
import java.util.Scanner;

public class sort0s1s {
    static int[] sortArr0s1s(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] == 0) {
                left++;
            }
            else if (arr[right] == 1) {
                right--;
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.println("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }
        sortArr0s1s(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
