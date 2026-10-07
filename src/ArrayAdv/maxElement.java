package ArrayAdv;

import java.util.Scanner;

public class maxElement {
    static int maxEl(int[] arr) {
        int max = arr[0];
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.println("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }
        int max = maxEl(arr);
        System.out.println("Maximum Element: " + max);
    }
}
