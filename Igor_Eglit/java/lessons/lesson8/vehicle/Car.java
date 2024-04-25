package lessons.lesson8.vehicle;

public class Car extends Vehicle {

    String numberPlate;

    public Car(String brand, String color, String driver) {
        super(brand, color, driver);
        this.numberPlate = "Unknown";
    }
    public void wash(){
        System.out.println("Car is washing");
    }
    public String getNumberPlate() {
        return numberPlate;
    }
    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
}
