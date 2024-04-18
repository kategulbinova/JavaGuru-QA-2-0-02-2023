package lessons.lesson8.vehiclesManagement;

public class Car extends Vehicle{
    String numberPlate;
    Car(String numberPlate){
        //super();
        this.numberPlate = numberPlate;
    }
    void wash(){
        System.out.println("***  Car " + numberPlate + " is washed!  ***");
    }

}
