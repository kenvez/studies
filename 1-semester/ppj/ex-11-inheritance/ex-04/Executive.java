public class Executive extends Manager {
    private double stockOptions;

    public Executive(String name, double baseSalary) {
        super(name, baseSalary);
        this.stockOptions = 0.0;
    }
    
    @Override
    public double getSalary() {
        double managerSalary = super.getSalary();
        
        return managerSalary * (1 + stockOptions);
    }
    
    @Override
    public void work() {
        System.out.println(getName() + " is managing a team of " + getTeamSize() + " people. Their stock has value [" + stockOptions + "].");
    }
    
    public void setStockOptions(double value) {
        if (value < 0.0 || value > 100.0) {
            System.out.println("Invalid value of stockOptions: " + value);
            return;
        }
        
        this.stockOptions = value;
    }
}