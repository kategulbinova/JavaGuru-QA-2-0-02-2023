package lessons.lesson8.vehicle;

public class Vehicle {
    String brand;
    String color;
    String driver;

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getDriver() {
        return driver;
    }

    Vehicle(String brand, String color, String driver) {
        this.brand = brand;
        this.color = color;
        this.driver = driver;
    }
    Vehicle(String brand) {
        this.brand = brand;
        this.color = "Unknown";
        this.driver = "Unknown";
    }

    Vehicle() {
        this.brand = "Unknown";
        this.color = "Unknown";
        this.driver = "Unknown";
    }

    public String getDriverInfo() {
        return "Driver of " + this.brand +" "+ this.driver;
    }
}
