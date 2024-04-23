package lessons.lesson8.vehicle;

public class Truck extends Car {

    int maxLoad;

    public Truck(String brand, String color, String driver) {
        super(brand, color, driver);
        this.numberPlate = "Unknown";
    }
    public void loadUp(int load){
        System.out.println("Truck "+this.brand+" is loading up to " + load + " kg");
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }
}
