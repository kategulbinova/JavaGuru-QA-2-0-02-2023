package lessons.lesson8.vehiclesManagement;

public class Sedan extends Car{
    int seats;

    Sedan(String numberPlate, int seats){
        super(numberPlate);
        this.seats = seats;
    }
}
