package Patterns;

public class rectBoxPattern2 {
    public static void main(String[] args) {
        int n = 5;

        for(int row=1; row<=n; row++) {
            for (int col=1; col<=n+2; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
