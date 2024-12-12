public class Exercise2 {
    public static void sayHello(String user) {
        System.out.println("Hello " + user + "!");
    }

    public static boolean lie(boolean value) {
        return !value;
    }

    public static boolean agree(boolean value) {
        return value ? true : true;
    }
    
    public static void main(String[] args) {
        sayHello("Konrad");
        System.out.println(lie(false));
        System.out.println(agree(false));
    }
}
