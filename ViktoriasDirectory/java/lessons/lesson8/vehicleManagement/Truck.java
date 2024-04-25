package lessons.lesson8.vehicleManagement;

public class Truck extends Car{
    double maxLoad;

    public Truck(String numberPlate, double maxLoad){
        super(numberPlate);
        this.maxLoad = maxLoad;
    }

    public void loadUp(){
        System.out.println("Truck number " + this.numberPlate + " is loaded with " + maxLoad);
    }
}
