import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wprowadz kwote: ");

        int amount = scanner.nextInt();
        
        int hundred;
        int fifty;
        int twenty;
        int ten;
        int five;
        int two;

        if (amount >= 100) {
            hundred = amount / 100;
            amount %= 100;

            System.out.println("Setki: " + hundred);
        }

        if (amount  >= 50) {
            fifty = amount / 50;
            amount %= 50;

            System.out.println("Piecdziesiatki: " + fifty);
        }
        
        if (amount >= 20) {
            twenty = amount / 20;
            amount %= 20;

            System.out.println("Dwudziestki: " + twenty);
        }
        
        if (amount >= 10) {
            ten = amount / 10;
            amount %= 10;

            System.out.println("Dziesiatki: " + ten);
        }
        
        if (amount >= 5) {
            five = amount / 5;
            amount %= 5;

            System.out.println("Piatki: " + five);
        } 
        
        if (amount >= 2) {
            two = amount / 2;
            amount %= 2;

            System.out.println("Dwojki: " + two);
        }
        
        if (amount >= 1) {
            System.out.println("Jedynki: " + amount);
        }

        scanner.close();
    }
}
