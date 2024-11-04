import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe: ");

        int wrt = scanner.nextInt();

        boolean inA = (wrt > -15 && wrt <= -10) || (wrt > -5 && wrt < 0) || (wrt > 5 && wrt < 10);
        boolean inB = (wrt < -13) || (wrt > -8 && wrt < 3);
        boolean inC = (wrt >= -4);

        if (inA && inB && inC) {
            System.out.println("Liczba nalezy do czesci wspolnej A, B i C");
        } else {
            System.out.println("Liczba nie nalezy do czesci wspolnej A, B i C");
        }

        scanner.close();
    }
}
