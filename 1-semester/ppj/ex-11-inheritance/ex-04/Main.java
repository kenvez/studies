public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 3000);
        Manager m1 = new Manager("Bob", 4000);
        Developer d1 = new Developer("Charlie", 4500, new String[]{"Java", "C++"});
        Intern i1 = new Intern("Dave", 2000, "MIT");
        Executive ex1 = new Executive("Eve", 5000);
        
        m1.hire(e1);
        m1.hire(d1);
        
        ex1.hire(i1);
        
        e1.work();
        m1.work();
        d1.work();
        i1.work();
        ex1.work();
        
        d1.work("Java");
        d1.work("Python");
        
        ex1.setStockOptions(1.5);

        System.out.println("\n--- Pensje ---");
        System.out.println(e1.getName() + " salary: " + e1.getSalary());
        System.out.println(m1.getName() + " salary: " + m1.getSalary());
        System.out.println(d1.getName() + " salary: " + d1.getSalary());
        System.out.println(i1.getName() + " salary: " + i1.getSalary());
        System.out.println(ex1.getName() + " salary: " + ex1.getSalary());
    }
}
