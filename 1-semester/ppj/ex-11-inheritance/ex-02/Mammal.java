public class Mammal extends Animal {
    String furColor;
    
    public Mammal(String furColor) {
        this.furColor = furColor;
    }
    
    public void run() {
        System.out.println("Mammal is running.");
    }
}