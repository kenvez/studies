public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Brown");

        System.out.println("Fur color: " + dog.furColor);
        
        dog.makeSound();
        dog.run();
        dog.bark();
    }
}