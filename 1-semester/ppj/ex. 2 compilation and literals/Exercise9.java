public class Exercise9 {
	public static void main(String[] args) {				
		/*	
			Przykłady opisujące ten sam literał (1234.567):
			- 12.34567E2
			- 1234567E-3
		/*
		
		/*
			1234.567L
			
			Nie, to jest literał typu long (z sufiksem L), który nie obsługuje wartości zmiennoprzecinkowych. 
			Ten zapis nie opisuje tej samej liczby, ponieważ L jest używane tylko dla liczb całkowitych.
		*/
		
		/*
			1.234567E06
			
			Nie, notacja wykładnicza 1.234567E06 oznacza 1.234567 * 10^6 = 1234567. 
			To nie jest ta sama wartość co 1234.567, więc ten zapis nie opisuje tej liczby.
		*/
	}
}