package ArrayAdv;

import java.util.Scanner;

public class zeroOnes {
    static int[] numOfZeros_Ones(int[] arr) {
        int numOfZeros = 0;
        int numOfOnes = 0;
        for (int num : arr) {
            if (num == 0) {
                numOfZeros ++;
            } else if (num == 1) {
                numOfOnes ++;
            }
        }
        return new int[]{numOfOnes, numOfZeros};
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.println("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }
        int[] result = numOfZeros_Ones(arr);
        System.out.println("Number of Ones: " + result[0]);
        System.out.println("Numbers of Zeros: " + result[1]);
    }
}
