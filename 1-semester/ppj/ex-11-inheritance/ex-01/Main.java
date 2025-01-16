public class Main {
    public static void main(String[] args) {
        Person person = new Person("John");
        Welder welder = new Welder("Mark", 12);
        
        person.display();
        welder.display();
    }
}