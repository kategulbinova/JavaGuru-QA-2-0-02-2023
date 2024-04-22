package lessons.lesson8.vehicle;

public class Sedan extends Car  {
    int seats;

    public Sedan(String brand, String color, String driver) {
        super(brand, color, driver);
        this.numberPlate = "Unknown";
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
