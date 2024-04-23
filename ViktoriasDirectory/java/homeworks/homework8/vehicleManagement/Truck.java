package homeworks.homework8.vehicleManagement;

public class Truck extends Car {
    double maxLoad;

    Truck(String numberPlate, double maxLoad){
        super(numberPlate);
        this.maxLoad = maxLoad;
    }

    void loadUp(){
        System.out.println("Truck number " + this.numberPlate + " is loaded with " + maxLoad);
    }
}
