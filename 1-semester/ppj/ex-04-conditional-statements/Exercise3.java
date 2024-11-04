import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj liczbe x: ");

		int x = scanner.nextInt();
		
		if (x == 0) {
			System.out.println("Liczba x jest rowna 0");
		} else if (x > 0) {
			System.out.println("Liczba x jest dodatnia");
		} else {
			System.out.println("Liczba x jest ujemna");
		}
		
		String isPositive = x == 0 ? "Liczba x jest rowna 0" : (x > 0 ? "Liczba x jest dodatnia" : "Liczba x jest ujemna");
	
		System.out.println(isPositive);

        scanner.close();
	}
}