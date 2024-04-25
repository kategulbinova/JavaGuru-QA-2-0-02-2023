package lesson8.VehicleManagement;

public class Truck extends Car{

    double maxLoad;
    Truck(String numberPlate, double maxLoad) {
        super(numberPlate);
        this.maxLoad = maxLoad;
    }

    void loadUp() {
        System.out.println("This truck is fully loaded up to " + maxLoad + "; " + this.numberPlate);
    }

    @Override
    void wash() {
        super.wash();
        System.out.println("This car has used a lot of water! " + maxLoad);
    }

}