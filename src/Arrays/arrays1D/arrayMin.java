package Arrays.arrays1D;

import java.util.Scanner;

public class arrayMin {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        int min = Integer.MAX_VALUE;



        for (int i=0; i<n; i++) {
            System.out.print("Enter the element of index " +i +": ");
            arr[i] = sc.nextInt();

            if (arr[i]< min) {
                min = arr[i];
            }
        }
        System.out.print("The minimum number of this array is: " +min);


    }
}
