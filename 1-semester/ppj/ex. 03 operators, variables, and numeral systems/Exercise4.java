public class Exercise4 {
	public static void main(String[] args) {
		/*
       Wynik będzie wyświetlony jako liczba całkowita 99,  
      'a' ma wartość Unicode 97,
      'a' + 2 = 97 + 2 = 99
    */
    
    System.out.println('a' + 2);

    /*
      Wynik będzie wyświetlony jako liczba całkowita 147,
      'a' ma wartość Unicode 97, a '2' ma wartość Unicode 50,
      'a' + '2' = 97 + 50 = 147
    */

		System.out.println('a' + '2');

    /*
      Wynik będzie wyświetlony jako znak 'c',  
      'a' + 2 daje 99, a (char)99 to znak odpowiadający wartości Unicode 99, czyli 'c'
    */

		System.out.println((char)('a'+ 2));

    /*
      Wynik będzie wyświetlony jako znak 'ppja2',  
      "ppj" + 'a' jest łączone jako String, więc "ppja",
      następnie "ppja" + '2' daje "ppja2" (String)
    */

		System.out.println("ppj" + 'a' + '2');

    /*
       Wynik będzie wyświetlony jako "ppja    2" (z tabulatorem między 'a' i '2'),
       "ppj" + 'a' daje "ppja", potem dodanie '\t' (tabulator) i '2' daje "ppja    2"
    */

		System.out.println("ppj" + 'a' + '\t' + '2');

    /*
      Wynik będzie wyświetlony jako '147ppj' ,
      'a' + '2' to operacja arytmetyczna, dająca 147 (Unicode 'a' + Unicode '2'),
      następnie 147 jest dodawane jako String do "ppj", co daje "147ppj"
    */

		System.out.println('a' + '2' + "ppj");
	}
}