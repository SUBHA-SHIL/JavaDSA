package Arrays.arrays2D;

import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("Enter the elements of row " + row + "and col " + col +": ");
                arr[row][col] = sc.nextInt();
                sum += arr[row][col];
            }
        }
        System.out.println(sum);
//        System.out.println("Sum of your 2D array is: ");
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                int value = arr[row][col];
//                sum = sum + value;
//
//            }
//            System.out.print(sum);
//        }

    }
}
