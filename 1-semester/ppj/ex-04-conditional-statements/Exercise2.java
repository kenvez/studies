import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Podaj liczbe x: ");

		int x = scanner.nextInt();

		if(x % 2 == 0) {
			System.out.println("Liczba x jest: parzysta");
		} else {
			System.out.println("Liczba x jest: nieparzysta");
		}

		String isEven = x % 2 == 0 ? "parzysta" : "nieparzysta";
		
		System.out.println("Liczba x jest: " + isEven);
	
        scanner.close();
    }
}