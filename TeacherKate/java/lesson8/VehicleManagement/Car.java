package lesson8.VehicleManagement;

public class Car extends Vehicle {
    String numberPlate;

    Car(String numberPlate) {
        this.numberPlate = numberPlate;
    }
    void wash() {
        System.out.println("This car is squeaky clean now! " + numberPlate);
    }

}
