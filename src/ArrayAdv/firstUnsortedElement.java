package ArrayAdv;

import java.util.Scanner;
// For ascending order
public class firstUnsortedElement {
    static int unsortedEl(int[] arr) {
        int unsortedElement = 0;
        for (int i = 0; i<arr.length; i++) {
            for (int j = i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    unsortedElement = arr[i];
                    break;
                }
            }
        }
        return unsortedElement;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.println("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }
        int ans = unsortedEl(arr);
        System.out.println("The first Unsorted element is: " + ans);
    }
}
