package Strings;

public class comparison {
    public static void main(String[] args) {

        String str = "Subha";
        String str1 = "SUBHA";

        // comparing Using == //
        if (str == str1) {
            // It only compares the reference or if there
            // is the same space provided for the both
            // objects str and str1.
            // It doesn't compare the actual string.
            System.out.println("Both Strings are same");
        }
        else
            System.out.println("Not same");

        // Using .equls() method
        if (str.equals(str1)) {
            System.out.println("Equal");
        }
        else
            System.out.println("not equal");

        // Using .equalsIgnoreCase()
        if (str.equalsIgnoreCase(str1)) {
            System.out.println("Same");
        }
        else
            System.out.println("Not same");

    }
}
