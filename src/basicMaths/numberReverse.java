package basicMaths;

import java.util.Scanner;

public class numberReverse {
    static void revDigits (int num) {
        int rev = 0;
        while(num != 0) {
            int digit = num % 10;
            rev = rev*10 + digit;
            num = num/10;
        }
        System.out.print(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        System.out.print("Reversed Number: ");
        revDigits(num);

    }
}
