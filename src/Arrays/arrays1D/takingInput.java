package Arrays.arrays1D;

import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.println("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }

        for(int val: arr) {
            System.out.println(val);
        }
    }
}
