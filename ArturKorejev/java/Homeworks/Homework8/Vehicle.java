package Homeworks.Homework8;


public class Vehicle {
    String brand;
    String color;
    String driver;

    Vehicle() {
        this.brand = "No brand";
        this.color = "Blank";
        this.driver = "Unknown";
    }

    public Vehicle(String color, String brand, String driver) {
    }

    String getDriverInfo() {
        return this.color + " " + this.brand + " " + "Driver's name is " + this.driver;
    }
}