package Homeworks.Homework8;


public class Truck extends Car {

    double maxLoad;

    Truck(String numberPlate, double maxLoad) {
        super(numberPlate);
        this.maxLoad = maxLoad;
    }

    void loadUp() {
        System.out.println("This truck is fully loaded up to " + maxLoad + "..");
    }

}
