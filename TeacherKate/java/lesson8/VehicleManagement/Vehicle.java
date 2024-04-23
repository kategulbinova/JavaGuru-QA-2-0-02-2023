package lesson8.VehicleManagement;

public class Vehicle {
    String brand;
    String color;
    String driver;

    Vehicle() {
        this.brand = "No brand";
        this.color = "blank";
        this.driver = "Unknown";
    }

    String getDriverInfo() {
        return "Driver's name is " + this.driver;
    }
}
