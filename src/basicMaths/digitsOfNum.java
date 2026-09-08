package basicMaths;

import java.util.Scanner;

public class digitsOfNum {
    static void digits (int num) {
        while(num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            num = num/10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        digits(num);

    }
}
