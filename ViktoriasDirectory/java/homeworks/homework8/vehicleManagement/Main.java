package homeworks.homework8.vehicleManagement;

public class Main {

    static void printVehicleDriverInfo(Vehicle vehicle){
        System.out.println(vehicle.getDriverInfo());
    }
    public static void main(String[] args) {

        Vehicle[] vehicles = {new Vehicle(), new Vehicle(),
                new Car("RS 5332"), new Car("AJ 7411"),
                new Truck("DD 345", 3000.00), new Truck("BH 987", 7000.0),
                new Sedan("FR 874", 7), new Sedan("KM 2154", 8),
                new Bicycle(5), new Bicycle(8)};
        String[] brands = {"YAMAHA", "KAWASAKI", "VOLVO", "TOYOTA", "SCANIA", "MAN", "FORD", "BMW", "TREK", "GIANT"};
        String[] colors = {"Soul red", "Blue", "PerlWhite", "Green", "Red", "Red", "Silver", "Black", "Green", "Silver"};
        String[] drivers = {"Viktoria", "No name", "Viktoria", "Irina", "Ervin", "Ivan", "Roman", "Janis", "Iveta", "Georgij"};

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].setBrand(brands[i]);
            vehicles[i].setColour(colors[i]);
            vehicles[i].setDriver(drivers[i]);
        }

        for (Vehicle vehicle : vehicles) {
            printVehicleDriverInfo(vehicle);
        }

        for (Vehicle vehicle : vehicles) {
            String className = vehicle.getClass().getSimpleName();
            // System.out.println(className);
            System.out.println(className + " " + vehicle.brand);
            switch (className) {
                case "Truck" -> {
                    ((Truck) vehicle).loadUp();
                }
                case "Car" -> {
                    ((Car) vehicle).wash();
                }
                case "Bicycle" -> {
                    ((Bicycle) vehicle).fold();
                }
                default -> {
                    System.out.println("### " + " don't have any function. ###");
                }
            }
        }

    }
}
