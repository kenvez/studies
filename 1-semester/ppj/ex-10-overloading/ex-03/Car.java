public class Car {
    private String brand;
    private String model;
    private int year;

    Car(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.year = 2024;
    }

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.year = 2024;
    }

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printInfo() {
        System.out.println(
            "Brand: " +
            this.brand +
            ", model: " +
            this.model +
            ", year: " +
            this.year
        );
    }

    public void drive() {
        System.out.println("Samochod jedzie.");
    }

    public void drive(int speed) {
        System.out.println("Samochod jedzie z predkoscia " + speed + " km/h.");
    }

    public void drive(String destination) {
        System.out.println("Samochod jedzie do " + destination + ".");
    }
}
