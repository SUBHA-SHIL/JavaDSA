package ArrayAdv;

import java.util.Arrays;
import java.util.Scanner;

public class shiftElementBy1Position {
    static int[] shiftElement(int[] arr) {
        int n = arr.length;
        int last = arr[n-1];

        int i = n-1;
        while (i > 0) {
            arr[i] = arr[i-1];
            i--;
        }
        arr[0] = last;
    return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.println("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }
        int[] ans = shiftElement(arr);
        System.out.println("Array after shifting: " + Arrays.toString(ans));

    }
}
