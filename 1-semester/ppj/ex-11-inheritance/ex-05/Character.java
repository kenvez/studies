public class Character {
    private String name;
    private double health;
    private double damage;
    
    public Character(String name, double health, double damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }
    
    public double getHealth() {
        return health;
    }
    
    public double getDamage() {
        return damage;
    }
    
    public void setHealth(double health) {
        this.health = health;
    }

    public void attack(Character target) {
        target.health -= this.damage;
    }
    
    public boolean isAlive() {
        return this.health > 0;
    }
}