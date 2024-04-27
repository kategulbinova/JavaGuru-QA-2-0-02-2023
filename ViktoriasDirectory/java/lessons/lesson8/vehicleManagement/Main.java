package lessons.lesson8.vehicleManagement;

public class Main {

    static void printVehicleDriverInfo(Vehicle vehicle){
        System.out.println(vehicle.getDriverInfo());
    }
    public static void main(String[] args) {

        Vehicle myMotorbike = new Vehicle();
        Car volvo = new Car("RS 5332");
        Car toyota = new Car("AJ 7411");
        Truck scania = new Truck("DD 345",3000.00);
        Sedan ford = new Sedan("FR 874", 7);
        Bicycle bike = new Bicycle(5);

        volvo.brand = "VOLVO";
        volvo.colour = "PerlWhite";
        volvo.driver = "Viktoria";

        toyota.brand = "TOYOTA";
        toyota.colour = "Green";
        toyota.driver = "Irina";

        ford.brand = "FORD";
        ford.colour = "Blue";
        ford.driver = "Ervin";

        bike.brand = "ZOOM";
        bike.colour = "Red";
        bike.driver = "Georgij";

        volvo.wash();
        toyota.wash();
        scania.loadUp();
        System.out.println(bike.isFolded);
        System.out.println(bike.brand);
        bike.fold();

        System.out.println(myMotorbike.getDriverInfo() + " " + myMotorbike.colour);
        printVehicleDriverInfo(volvo);
        printVehicleDriverInfo(toyota);
        printVehicleDriverInfo(scania);
        printVehicleDriverInfo(ford);
        printVehicleDriverInfo(bike);
        System.out.println(bike.colour);
    }
}
