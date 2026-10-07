package ArrayAdv;

import java.util.ArrayList;
import java.util.Scanner;

public class mulElement {
    static ArrayList<Integer> multiplyElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr) {
             i = i * 10;
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.println("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Updated array: " + multiplyElement(arr));
    }
}
