import java.util.*;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char infinity = '\u221E';
		
		System.out.println("Podaj liczbe: ");
		
		double number = scanner.nextDouble();

		if (number <= -10) {
			System.out.println("Liczba nalezy do przedziału: (-" + infinity + " -10)");
		} else if (number > -15 && number < 5) {
            System.out.println("Liczba nalezy do przedzialu: (-15, 5)");
        } else if (number >= -5 && number <= 10) {
            System.out.println("Liczba nalezy do przedzialu: [-5, 10]");
        } else if (number > 10) {
            System.out.println("Liczba nalezy do przedzialu: (10, " + infinity + ")");
        } else {
            System.out.println("Liczba nie nalezy do zadnego przedzialu");
        }
		
		scanner.close();
	}
}