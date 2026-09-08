package basicMaths;

import java.util.Scanner;

public class isPalindrome {
    static int revDigits (int num) {
        int rev = 0;
        while(num != 0) {
            int digit = num % 10;
            rev = rev*10 + digit;
            num = num/10;
        }
        return rev;
//        System.out.println(num);
//        System.out.println(rev);
//        if (rev == num) {
//            System.out.println("Palindrome");
//        }
//        else
//            System.out.println("Not Palindrome");
    }
    static void isPal(int num, int rev) {
        if (rev == num) {
          System.out.println("Palindrome");
       }
       else
          System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        isPal(num, revDigits(num));

    }
}
