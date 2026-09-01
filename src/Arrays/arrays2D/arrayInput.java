package Arrays.arrays2D;

import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
         int[][] arr = new int[3][4];
         Scanner sc = new Scanner(System.in);

         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                 System.out.print("Enter the elements of row " + row + "and col " + col +": ");
                 arr[row][col] = sc.nextInt();
             }
         }
        System.out.println("You 2D array is: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");

            }
            System.out.println();
        }

    }
}
