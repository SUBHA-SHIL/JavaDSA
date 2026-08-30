package Arrays;

public class basics {
    public static void main(String[] args) {
        //declaration
        int[] arr;
        // allocation
        arr = new int[5];

        // init
        int[] brr = {10, 20, 30};

//        System.out.println("Value at 0 index: " + brr[0]);
//        System.out.println("Value at 1 index: " + brr[1]);
//        System.out.println("Value at 2 index: " + brr[2]);

        int n = brr.length;
        for (int i = 0; i <= n-1; i++) {
            System.out.println(brr[i]);
        }

    }
}
