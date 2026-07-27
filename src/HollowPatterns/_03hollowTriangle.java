package HollowPatterns;

public class _03hollowTriangle {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Print leading spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print("  ");
            }

            // Print stars
            for (int col = 1; col <= 2 * row - 1; col++) {

                if (row == 1 || row == n || col == 1 || col == 2 * row - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}