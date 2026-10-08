package ArrayAdv;

import java.util.Arrays;
import java.util.Scanner;

public class arrayReverse {
    static int[] arrRev(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while(i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.println("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }
        int[] ans = arrRev(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
