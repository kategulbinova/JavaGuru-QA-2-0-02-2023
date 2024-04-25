package lessons.lesson8.vehicleManagement;

public class Sedan extends Car{
    int seats;

    public Sedan(String numberPlate, int seats){
        super(numberPlate);
        this.seats = seats;
    }
}
