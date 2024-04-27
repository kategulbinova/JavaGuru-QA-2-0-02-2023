package homeworks.VehicleManage;

public class Vehicle {
    String brand;
    String colour;
    String driver;
    Boolean isFixed = false;

    Vehicle() {
        this.brand = "Some brand";
        this.driver = "Some driver";
        this.colour = "Unknown";
    }
    String getDriverInfo(){
        return "Driver name is " + this.driver;

    }
    void fix() {
        isFixed = true;
        System.out.println("This vehicle is fixed now!");
    }
}
