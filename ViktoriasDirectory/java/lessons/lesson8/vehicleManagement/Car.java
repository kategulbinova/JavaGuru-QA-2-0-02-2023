package lessons.lesson8.vehicleManagement;

public class Car extends Vehicle{
    String numberPlate;
    public Car(String numberPlate){
        //super();
        this.numberPlate = numberPlate;
    }
    public void wash(){
        System.out.println("***  Car " + numberPlate + " is washed!  ***");
    }

}
