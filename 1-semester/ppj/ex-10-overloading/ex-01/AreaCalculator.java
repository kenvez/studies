public class AreaCalculator {
    public static double calculateArea(int side) {
        return side * side;
    }

    public static double calculateArea(int firstSide, int secondSide) {
        return firstSide * secondSide;
    }

    public static double calculateArea(double radius) {
        return Math.PI * (radius * radius);
    }

    public static void main(String[] args) {
        System.out.println(calculateArea(5));
        System.out.println(calculateArea(4, 6));
        System.out.println(calculateArea(3.0));
    }
}
