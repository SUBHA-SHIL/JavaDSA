package Arrays.arrays1D;

import java.util.Scanner;

public class arrayMax {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        int max = arr[0];



        for (int i=0; i<n; i++) {
            System.out.print("Enter the element of index " +i +": ");
            arr[i] = sc.nextInt();

            if (arr[i]> max) {
                max = arr[i];
            }
        }
        System.out.print("The maximum number of this array is: " +max);


    }

}
