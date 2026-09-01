package Arrays.arrays1D;

import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        int sum = 0;

        for (int i = 0; i<n; i++) {
            System.out.print("Enter the element of index " +i +": ");
            arr[i] = sc.nextInt();

            sum += arr[i];


        }
        System.out.println("The sum of the array is: " +sum);

    }
}
