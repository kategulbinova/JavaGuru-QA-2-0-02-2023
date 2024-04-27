package homeworks.VehicleManage;

public class Car extends Vehicle {
    String numberPlate;
    Car(String numberPlate) {
        this.numberPlate = numberPlate;
    }
    void wash() {
        System.out.println("This car is clean now!" + numberPlate);
    }

}
