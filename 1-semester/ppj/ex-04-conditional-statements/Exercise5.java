import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Podaj liczbe: ");

        int wrt = scanner.nextInt();

        boolean inA = (wrt > -15 && wrt < -10);
        boolean inB = (wrt < -13);

        if (inA && !inB) {
            System.out.println("Liczba nalezy tylko do zbioru A");
        } else if (!inA && inB) {
            System.out.println("Liczba nalezy tylko do zbioru B");
        } else {
            System.out.println("Liczba nie należy wyłącznie do jednego zbioru");
        }

        scanner.close();
    }
}
