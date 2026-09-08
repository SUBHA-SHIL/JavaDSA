package Strings;

// Don't laugh at the code. I am just trying to find the length of a String without using the .length() function.

public class stringLen {
    static int getLengthOfString(String str) {
        char[] arr = str.toCharArray();
        return arr.length;
    }

    public static void main(String[] args) {
        String str = "SUBHA";
        System.out.println(getLengthOfString(str));
    }
}
