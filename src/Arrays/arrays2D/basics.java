package Arrays.arrays2D;

public class basics {
    public static void main(String[] args) {

        //declaration
        int[][] arr = new int[3][3];

        //init
        int[][] brr = {
                {1,},
                {4,5,6},
                {7,8,9,2,3}
        };

//        System.out.println(brr[1][2]);

        int rowLen = brr.length;
//        int colLen = brr[0].length;

        for (int row = 0; row <= rowLen-1; row++) {
            int colLen = brr[row].length;
            for (int col = 0; col <= colLen-1; col++) {
                System.out.print(brr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
