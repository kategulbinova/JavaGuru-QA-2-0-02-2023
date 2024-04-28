package Homeworks.Homework8;


public class Car extends Vehicle {

    String numberPlate;

    public Car(String color, String brand, String driver) {
        super(color, brand, driver);
        this.numberPlate = "none";

    }

    public Car() {
    }

    void wash() {
        System.out.println("This car is squeaky clean now! " + numberPlate);
    }

}
