public class Exercise8 {
	public static void main(String[] args) {		
		/*
			Zbyt duża liczba dla typu int (maksimum to 2147483647)
			
			int numberInt = 2147483648;
		*/
		
		/*
			Użycie sufiksu 'L' oznacza, że liczba jest typu long, który ma większy zakres.
		*/
		
		long numberLong = 2147483648l;
		
		System.out.println(numberLong);
	}
}