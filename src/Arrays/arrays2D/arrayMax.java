package Arrays.arrays2D;

import java.util.Scanner;

public class arrayMax {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        Scanner sc = new Scanner(System.in);

        int maxVal = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("Enter the elements of row " + row + "and col " + col + ": ");
                arr[row][col] = sc.nextInt();
                if (arr[row][col]>maxVal) {
                    maxVal = arr[row][col];
                }
            }
        }
        System.out.println("The maximum value of this 2-D array is: " +maxVal);
    }
}
