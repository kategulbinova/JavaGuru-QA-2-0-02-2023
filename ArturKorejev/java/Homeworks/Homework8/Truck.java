package Homeworks.Homework8;


public class Truck extends Car {

    double maxLoad;

    public Truck(String color, String brand, String driver) {
        super();
        this.maxLoad = maxLoad;
    }

    void loadUp() {
        System.out.println("This truck is fully loaded up to " + maxLoad + "..");
    }

}
