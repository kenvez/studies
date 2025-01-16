public class Manager extends Employee {
    private Employee[] teamMembers;
    
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
        this.teamMembers = new Employee[0];
    }
    
    @Override
    public double getSalary() {
        return super.getSalary() + teamMembers.length * 100.0;
    }
    
    @Override
    public void work() {
        System.out.println(getName() + " is managing a team of " + teamMembers.length +  " people.");
    }
    
    public void hire(Employee employee) {
        Employee[] newTeam = new Employee[teamMembers.length + 1];

        for (int i = 0; i < teamMembers.length; i++) {
            newTeam[i] = teamMembers[i];
        }

        newTeam[newTeam.length - 1] = employee;

        teamMembers = newTeam;
    }
    
    public int getTeamSize() {
        return teamMembers.length;
    }
}