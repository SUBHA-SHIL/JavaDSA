package ArrayAdv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class missingElementsFromArrayOfDuplicates {
    static List<Integer> findNum(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int value = Math.abs(arr[i]);
            int currentIndex = value - 1;

            if (arr[currentIndex] > 0) {
                arr[currentIndex] = -arr[currentIndex];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                int valAtThisIndex = i + 1;
                ans.add(valAtThisIndex);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.print("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Missing Nums: " + findNum(arr));
    }
}
