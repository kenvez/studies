public class Person {
    private final String fullName;
    private final int birthYear;

    Person(String fullName) {
        this.fullName = fullName;
        this.birthYear = 2024;
    }

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.birthYear = 2024 - age;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public void printInfo() {
        System.out.println("Imie i nazwisko: " + this.fullName);
        System.out.println("Rok urodzenia: " + this.birthYear);
    }

    public int getAge() {
        return 2024 - this.birthYear;
    }

    public int getAge(int year) {
        return year - this.birthYear;
    }
}
