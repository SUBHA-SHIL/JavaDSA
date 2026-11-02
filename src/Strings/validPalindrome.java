package Strings;

public class validPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        System.out.println(s);
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                return true;
            }
            left++;
            right--;
        }
        return false;
    }
    public static void main(String[] args) {
        String word1 = "A man, a plan, a canal: Panama";
        String word2 = "race a car";

        System.out.println(word1 + " is palindrome: " + isPalindrome(word1)); // Output: true
        System.out.println(word2 + " is palindrome: " + isPalindrome(word2)); // Output: false
    }
}
