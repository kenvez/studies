public class Exercise3 {
	public static void main(String[] args) {
		byte byteVar = 10;
        	char charVar = 'A';
        	int intVar = 100;
        	float floatVar = 5.5f;
        	double doubleVar = 3.14;

        	int charResult = charVar + intVar;
        	int intResult = intVar + charVar;
        	double floatResult = floatVar + doubleVar;
        	int byteResult = byteVar + intVar;

        	System.out.println("charResult (char + int) = " + charResult);
        	System.out.println("intResult (int + char) = " + intResult);
        	System.out.println("floatResult (float + double) = " + floatResult);
        	System.out.println("byteResult (byte + int) = " + byteResult);
	}
}