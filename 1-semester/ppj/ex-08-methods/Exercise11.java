public class Exercise11 {
    public static int sum(int n) {
        if (n == 0) return 0;

        int sum = sum(n / 10) + n % 10;

        return sum;
    }
    
    public static void main(String[] main) {
        System.out.println(sum(123));
    }
}
