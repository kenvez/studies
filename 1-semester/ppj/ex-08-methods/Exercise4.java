public class Exercise4 {
    public static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max)
            max = b; 
         
        if (c > max)
            max = c;
        
        return max;
    }

    public static int findMin(int a, int b, int c) {
        int min = a;

        if (b < min)
            min = b; 
         
        if (c < min)
            min = c;
        
        return min;
    }
    public static void main(String[] args) {
        System.out.println(findMax(2, 10, 3));
        System.out.println(findMin(93, 14, 54));
    }
}
