public class Archer extends Character {
    private int arrows;
    
    public Archer(String name, double health, double damage, int arrows) {
        super(name, health, damage);
        this.arrows = arrows;
    }
    
    public int getArrows() {
        return arrows;
    }
    
    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    
    @Override
    public void attack(Character target) {
        if (this.arrows > 0) {
            super.attack(target);
            
            this.arrows--;
        }
    }
}