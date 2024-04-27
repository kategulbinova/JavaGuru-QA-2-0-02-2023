package homeworks.homework8;

import lessons.lesson8.vehicle.*;

import java.util.Arrays;

public class MainCorrespondingVehicleLesson8 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("BMW", "Black", "Ivan"),
                new Truck("Volvo", "White", "Petr"),
                new Sedan("Audi", "Red", "Vasya"),
                new Bicycle("Author",21),
                new Truck("Scania", "Blue", "Vladimir"),
                new Sedan("Mercedes", "Yellow", "Sergey"),
                new Bicycle("Rock",18),
                new Car("Toyota", "Green", "Alex"),
                new Truck("DAF", "Grey", "Andrey"),
                new Sedan("Lexus", "Silver", "Dmitry")
        };
        printDriverInfo(vehicles);
        selectAndExecuteAppropriateMethodForVehicleType(vehicles);
    }

    public static void printDriverInfo(Vehicle[] vehicles) {
        Arrays.stream(vehicles).forEach(vehicle -> System.out.println(vehicle.getDriverInfo()));
    }

    public static void selectAndExecuteAppropriateMethodForVehicleType(Vehicle[] vehicles) {
        Arrays.stream(vehicles).forEach(vehicle -> {

            if (vehicle instanceof Car) {
                System.out.print(vehicle.getBrand()+" ");
                ((Car) vehicle).wash();
            }
            if (vehicle instanceof Truck) {
                ((Truck) vehicle).loadUp(9000);
                ((Truck) vehicle).setMaxLoad(10000);
                System.out.println("Truck "+vehicle.getBrand()+" max load " + ((Truck) vehicle).getMaxLoad());
            }
            if (vehicle instanceof Sedan) {
                ((Sedan) vehicle).setSeats(4);
                System.out.println("Sedan "+vehicle.getBrand()+" Seats number " + ((Sedan) vehicle).getSeats());
            }
            if (vehicle instanceof Bicycle) {
                System.out.print(vehicle.getBrand()+" ");
                ((Bicycle) vehicle).fold();
            }
        });
    }
}
