package Arrays.arrays2D;

import java.util.Scanner;

public class arrayMin {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        Scanner sc = new Scanner(System.in);

        int minVal = Integer.MAX_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("Enter the elements of row " + row + "and col " + col + ": ");
                arr[row][col] = sc.nextInt();
                if (arr[row][col]<minVal) {
                    minVal = arr[row][col];
                }
            }
        }
        System.out.println("The minimum value of this 2-D array is: " +minVal);
    }
}
