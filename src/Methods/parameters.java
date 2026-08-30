package Methods;

public class parameters {
    static void printSum(int x, int y) {
        System.out.println("Sum: " + (x + y));
    }

    public static int sumNum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
//        printSum(5,9);
        int result = sumNum(43, 20);
        System.out.print("Result: " + result);
    }
}
