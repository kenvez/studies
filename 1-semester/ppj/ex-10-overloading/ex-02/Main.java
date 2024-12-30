public class Main {
    public static void main(String[] args) {
        Person personFirst = new Person("Jan Kowalski");
        Person personSecond = new Person("Anna Skrzypczak", 34);

        personFirst.printInfo();
        personSecond.printInfo();

        System.out.println(personFirst.getFullName());
        System.out.println(personFirst.getBirthYear());

        System.out.println(personFirst.getAge());
        System.out.println(personSecond.getAge(2012));
    }
}
