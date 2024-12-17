public class Exercise10 {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int sum = fibonacci(n - 1) + fibonacci(n - 2);
        
        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
