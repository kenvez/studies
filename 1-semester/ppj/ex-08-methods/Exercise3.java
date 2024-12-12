public class Exercise3 {
    public static void modifyValue(int value) {
        System.out.println(value);

        value *= 5;

        System.out.println(value);
    }
    public static void main(String[] args) {
        int wrt = 5;
        
        System.out.println(wrt);

        modifyValue(wrt);

        System.out.println(wrt);

        /*
             Metoda nie zmienia wartości wrt, 
             tylko wyświetla wartość value z metody.
        */
    }
}
