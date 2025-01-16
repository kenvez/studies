public class Intern extends Employee {
    private String university;
    private long cupsOfCoffeeDelivered;
    
    public Intern(String name, double baseSalary, String university) {
        super(name, baseSalary);
        this.university = university;
        this.cupsOfCoffeeDelivered = 0;
    }
    
    public double getSalary() {
        double base = super.getSalary();
        String uni = university.toUpperCase();
        
        if (uni.equals("PJATK")) {
            return base + 0.20 * cupsOfCoffeeDelivered;
        } else if (uni.length() > 0) {
            char firstChar = uni.charAt(0);
            
            if (firstChar >= 'A' && firstChar <= 'M') {
                return base + 0.10 * cupsOfCoffeeDelivered;
            } else if (firstChar >= 'N' && firstChar <= 'Z') {
                return base + 0.15 * cupsOfCoffeeDelivered;
            }
        }

        return base;
    }
    
    
    public void work() {
        cupsOfCoffeeDelivered++;
    }
}