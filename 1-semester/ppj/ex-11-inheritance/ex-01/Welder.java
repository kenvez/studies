public class Welder extends Person {
    int seniority;
    
    public Welder(String name, int seniority) {
        super(name);
        this.seniority = seniority;
    }
    
    public void display() {
        System.out.println("Name: " + super.name);
        System.out.println("Seniority: " + this.seniority);
    }
}