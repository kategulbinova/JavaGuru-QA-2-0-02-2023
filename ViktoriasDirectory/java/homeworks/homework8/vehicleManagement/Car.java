package homeworks.homework8.vehicleManagement;

public class Car extends Vehicle {
    String numberPlate;
    Car(String numberPlate){
        this.numberPlate = numberPlate;
    }
    void wash(){
        System.out.println("***  Car " + numberPlate + " is washed!  ***");
    }

}
