package Strings;

import java.util.Scanner;

public class stringRev {
    static boolean revString(String str) {
        String rev = "";
        int n = str.length();
        for (int i = n-1 ; i>=0; i--) {
            char ch = str.charAt(i);
            rev += ch;
        }
        if (rev.equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String str = sc.nextLine();

        System.out.println("Is reversed: " +revString(str));
    }
}
