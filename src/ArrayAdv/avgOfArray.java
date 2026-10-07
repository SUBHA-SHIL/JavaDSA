package ArrayAdv;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class avgOfArray {
    static double getAvg(int[] arr) {
        double sum = 0;
        for(int i : arr) {
            sum += i;
        }
        int size = arr.length;
        double avg = sum/size;
        return avg;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        for (int i=0; i<n; i++) {
            System.out.println("Enter  " +i +"th term: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The avg of: " + Arrays.toString(arr) + "is: " + getAvg(arr));
    }

}
