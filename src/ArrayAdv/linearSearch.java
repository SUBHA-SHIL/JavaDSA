package ArrayAdv;

public class linearSearch {
    static boolean search(int[] arr, int target) {
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,5};
        boolean ans = search(arr, 9);
        System.out.println(ans);
    }

}
