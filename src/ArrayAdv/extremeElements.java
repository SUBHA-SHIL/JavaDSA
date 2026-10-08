package ArrayAdv;

import java.util.Arrays;
import java.util.Scanner;

public class extremeElements {
    static void extElement(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i <= j) {
            if (i == j) {
                System.out.println(arr[i]);
                return;
            }
            else {
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.println("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }
        extElement(arr);
    }
}
