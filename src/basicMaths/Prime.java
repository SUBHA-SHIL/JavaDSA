package basicMaths;

import java.util.Scanner;

public class Prime {
    static void isPrime (int num) {
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        }
        else {
            for (int i = 2; i<num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.print(isPrime);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        System.out.print("Is Prime: ");
        isPrime(num);

    }
}
