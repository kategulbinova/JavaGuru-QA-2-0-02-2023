package Lessons.lesson8.Vehicle;

public class Vehicle {
    String brand;
    String color;
    String driver;

    Vehicle() {
        this.brand = "No brand";
        this.color = "Blank";
        this.driver = "Unknown";
    }

    String getDriverInfo() {
        return "Driver's name is " + this.driver;
    }
}













