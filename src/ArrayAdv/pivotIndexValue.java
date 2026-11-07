package ArrayAdv;

import java.util.Scanner;

public class pivotIndexValue {
    static int pivotIndex(int[] arr) {
        int n = arr.length;
        int[] leftSum = new int[n+1];
        int[] rightSum = new int[n+1];

        leftSum[0] = arr[0];
        for (int i=1; i<n; i++) {
            leftSum[i] = leftSum[i-1] + arr[i];
        }
        rightSum[n-1] = arr[n-1];
        for (int i=n-1; i>0; i--) {
            rightSum[i] = rightSum[i+1] + arr[i];
        }
        for (int i= 0; i<n; i++){
            if (leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[8];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.print("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Pivot index: " + pivotIndex(arr));
    }
}
