package Strings;

import java.util.Scanner;

public class countVowels {
    static int vowelCount(String str) {
        int count = 0;
        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String str = sc.nextLine();

        System.out.println("Number of vowels: " +vowelCount(str));
    }
}
