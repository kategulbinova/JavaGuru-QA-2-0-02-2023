package lessons.lesson8.vehicle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "Black", "Ivan");
        car.setNumberPlate("AA 1234");
        System.out.println(car.getDriverInfo());
        System.out.println(car.getNumberPlate());
        car.wash();
        Vehicle bike = new Vehicle();
        bike.driver = "Nikolay";
        System.out.println(bike.getDriverInfo());
        System.out.println("Truck....................");
        Truck truck = new Truck("Volvo", "White", "Petr");
        truck.setNumberPlate("BB 4321");
        truck.setMaxLoad(10000);
        System.out.println("Truck brand " + truck.brand + ", " +
                "color " + truck.color + ", " +
                "number plate " + truck.numberPlate + ", " +
                "max load " + truck.maxLoad);
        truck.loadUp(9000);
        System.out.println(truck.getDriverInfo());
        truck.wash();
        System.out.println("Sedan....................");
        Sedan sedan = new Sedan("Audi", "Red", "Vasya");
        sedan.setNumberPlate("CC 5678");
        sedan.setSeats(4);
        System.out.println("Seats number " + sedan.getSeats());
        System.out.println(sedan.getDriverInfo());
        System.out.println("Bike....................");
        Bicycle bicycle = new Bicycle("Rock",21);
        bicycle.driver = "Sergey";
        System.out.println(bicycle.getDriverInfo());
        System.out.println("Speed count " + bicycle.speedCount);
        System.out.println("Is folded " + bicycle.isFolded());
        System.out.println("Brand " + bicycle.brand);
        bicycle.fold();
    }
}