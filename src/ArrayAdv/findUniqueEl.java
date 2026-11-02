package ArrayAdv;

import java.util.Arrays;
import java.util.Scanner;

/*You are given an array of integers where each element appears twice,
except for one distinct element that appears only once.
Your task is to identify and return this unique element.
Implement an efficient solution that operates in linear time complexity
with with constant co addition additional space.*/

public class findUniqueEl {
    static int uniqueEl(int[] arr) {
        int xorSum = 0;
        for(int n: arr) {
            xorSum = xorSum ^ n;
        }
        return xorSum;
    }
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.println("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }
        int result = uniqueEl(arr);
        System.out.println("Unique Element: " + result);
    }
}
