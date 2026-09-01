package Arrays.arrays1D;

import java.util.Scanner;

public class arrayMultiply {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        int mul = 1;

        for (int i = 0; i<n; i++) {
            System.out.print("Enter the element of index " +i +": ");
            arr[i] = sc.nextInt();

            mul *= arr[i];


        }
        System.out.println("The multiplication of the array is: " +mul);

    }
}
