import java.util.*;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Podaj liczbe x: ");
		int x = scanner.nextInt();
		
		System.out.print("Podaj liczbe y: ");
		int y = scanner.nextInt();

		if (x == y) {
			System.out.println("Liczby sa rowne");
		} else if (x > y) {
			System.out.println("Liczba x jest wieksza od y");
		} else {
			System.out.println("Liczba y jest wieksza od x");
		}
		
		String larger = x == y ? "Liczby sa rowne" : (x > y ? "Liczba x jest wieksza od y" : "Liczba y jest wieksza od x");
	
		System.out.println(larger);

        scanner.close();
	}
}