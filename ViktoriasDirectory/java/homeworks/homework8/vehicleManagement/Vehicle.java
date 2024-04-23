package homeworks.homework8.vehicleManagement;

public class Vehicle {
    String brand;
    String colour;
    String driver;

    Vehicle(){
        this.brand = "No brand";
        this.colour = "Blank";
        this.driver = "Unknown";
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setDriver(String driver) {
        this.driver = driver;
    }
    String getDriverInfo(){
        return "Driver's name is: " + this.driver;
    }

}
