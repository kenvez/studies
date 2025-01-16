public class Mage extends Character {
    private double mana;
    
    public Mage(String name, double health, double damage, double mana) {
        super(name, health, damage);
        this.mana = mana;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }
    
    @Override
    public void attack(Character target) {
        double boostedDamage = this.getDamage() * 1.5;
        
        if (this.mana > 10) {
            target.setHealth(target.getHealth() - boostedDamage);
            this.mana -= 10;
        } else {
            super.attack(target);
        }
    }
}