public class Exercise9 {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
