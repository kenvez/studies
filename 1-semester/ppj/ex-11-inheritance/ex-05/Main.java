public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Warrior", 120, 15, 20);
        Mage mage = new Mage("Mage", 80, 25, 30);
        Archer archer = new Archer("Archer", 100, 10, 3);

        System.out.println("=== Początkowy stan postaci ===");
        System.out.println(warrior.getName() + " -> Health: " + warrior.getHealth() + ", Armor: " + warrior.getArmor());
        System.out.println(mage.getName() + " -> Health: " + mage.getHealth() + ", Mana: " + mage.getMana());
        System.out.println(archer.getName() + " -> Health: " + archer.getHealth() + ", Arrows: " + archer.getArrows());

        System.out.println("\n=== Rozpoczęcie bitwy ===");
        
        mage.attack(warrior);
        System.out.println("Mage zaatakował Warrior'a.");
        System.out.println(warrior.getName() + " -> Health: " + warrior.getHealth());

        archer.attack(mage);
        System.out.println("Archer zaatakował Mage'a.");
        System.out.println(mage.getName() + " -> Health: " + mage.getHealth() + ", Mana: " + mage.getMana());

        warrior.attack(archer);
        System.out.println("Warrior zaatakował Archer'a.");
        System.out.println(archer.getName() + " -> Health: " + archer.getHealth() + ", Arrows: " + archer.getArrows());

        archer.attack(mage);
        System.out.println("Archer zaatakował Mage'a.");
        System.out.println(mage.getName() + " -> Health: " + mage.getHealth() + ", Mana: " + mage.getMana());

        mage.attack(archer);
        System.out.println("Mage zaatakował Archer'a.");
        System.out.println(archer.getName() + " -> Health: " + archer.getHealth() + ", Arrows: " + archer.getArrows());

        System.out.println("\n=== Koniec bitwy ===");
    }
}
