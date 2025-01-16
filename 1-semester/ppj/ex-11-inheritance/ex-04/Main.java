public class Main {
    public static void main(String[] args) {
        // Tworzymy obiekty różnych klas
        Employee e1 = new Employee("Alice", 3000);
        Manager m1 = new Manager("Bob", 4000);
        Developer d1 = new Developer("Charlie", 4500, new String[]{"Java", "C++"});
        Intern i1 = new Intern("Dave", 2000, "MIT");
        Executive ex1 = new Executive("Eve", 5000);

        // Dodajmy kogoś do zespołu managera
        m1.hire(e1);
        m1.hire(d1);

        // Dodajmy kogoś do zespołu executive (który też dziedziczy po Manager)
        ex1.hire(i1);

        // Wywołajmy work() na każdym
        e1.work();   // "Alice is working."
        m1.work();   // "Bob is managing a team of 2 people."
        d1.work();   // "Charlie is coding in Java, C++."
        i1.work();   // "Dave delivered coffee. Total cups: 1"
        ex1.work();  // "Eve is managing a team of 1 people. Their stock has value [0.0]."

        // Przykład wykorzystania work(String language) na Developerze
        d1.work("Java");   // "Charlie is coding in Java."
        d1.work("Python"); // "Charlie doesn't know Python."

        // Ustawmy stockOptions na 1.5 (150%)
        ex1.setStockOptions(1.5);

        System.out.println("\n--- Pensje ---");
        System.out.println(e1.getName() + " salary: " + e1.getSalary());
        System.out.println(m1.getName() + " salary: " + m1.getSalary());
        System.out.println(d1.getName() + " salary: " + d1.getSalary());
        System.out.println(i1.getName() + " salary: " + i1.getSalary());
        System.out.println(ex1.getName() + " salary: " + ex1.getSalary());
    }
}
