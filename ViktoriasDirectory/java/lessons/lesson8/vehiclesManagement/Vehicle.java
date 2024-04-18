package lessons.lesson8.vehiclesManagement;

public class Vehicle {
    String brand;
    String colour;
    String driver;

    Vehicle(){
        this.brand = "No brand";
        this.colour = "Blank";
        this.driver = "Unknown";
    }

    String getDriverInfo(){
        return "Driver's name is: " + this.driver;
    }

}
