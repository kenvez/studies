public class Developer extends Employee{
    private String[] programmingLanguages;
    
    public Developer(String name, double baseSalary, String[] programmingLanguages) {
        super(name, baseSalary);
        this.programmingLanguages = programmingLanguages != null ? programmingLanguages : new String[0];
    }
    
    @Override
    public double getSalary() {
        double base = super.getSalary();
        
        return base + 0.02 * base * programmingLanguages.length;
    }
    
    @Override
    public void work() {
        String languages = String.join(", ", programmingLanguages);        
        System.out.println(getName() + " is coding " + languages);
    }
    
    public void work(String language) {
        boolean knowsLanguage = false;

        for (int i = 0; i < programmingLanguages.length; i++) {
            if (programmingLanguages[i].equals(language)) {
                knowsLanguage = true;
            }
        }

        if (knowsLanguage) {
            System.out.println(getName() + " is coding in " + language + ".");
        } else {
            System.out.println(getName() + " doesn’t know " + language + ".");
        }
    }
    
}