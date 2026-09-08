package basicMaths;

import java.util.Scanner;

public class countDigits {
    static void numDigits (int num) {
        int count = 0;
        while(num != 0) {
            int digit = num % 10;
            count ++;
            num = num/10;
        }
        System.out.print(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        numDigits(num);

    }
}
