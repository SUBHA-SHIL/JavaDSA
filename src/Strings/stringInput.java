package Strings;

import java.util.Scanner;

public class stringInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("how are you?");
        String str = sc.nextLine();
        System.out.println("Value using next(): " +str);

        System.out.println("how are you?");
        String str2 = sc.next();
        System.out.println("Value using nextLine(): " +str2);
    }
}
