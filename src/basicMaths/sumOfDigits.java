package basicMaths;

import java.util.Scanner;

public class sumOfDigits {
    static void digitsSum (int num) {
        int sum = 0;
        while(num != 0) {
            int digit = num % 10;
            sum += digit;
            num = num/10;
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        digitsSum(num);

    }
}
