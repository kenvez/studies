public class Warrior extends Character {
    private double armor;
    
    public Warrior(String name, double health, double damage, double armor) {
        super(name, health, damage);
        this.armor = armor;
    }

    public double getArmor() {
        return armor;
    }
    
    @Override
    public void attack(Character target) {
        target.setHealth(target.getHealth() - this.getDamage() - (armor / 2));
    }
}