package ArrayAdv;

import java.util.Scanner;

public class removeDuplicate {
    static int remDuplicate(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i] != arr[k]) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.println("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Unique Elements: " + remDuplicate(arr));
    }
}
