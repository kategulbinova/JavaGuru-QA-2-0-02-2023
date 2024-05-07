package homework8;

public class VehicleManager {
    abstract static class Vehicle {
        abstract String getDriverInfo();
        }

        static class Truck extends Vehicle {
            @Override
            String getDriverInfo() {
                return "Truck driver info";
            }
            void loadUp() {
                System.out.println("Loading truck");
            }
        }

        static class Sedan extends Vehicle {
            @Override
            String getDriverInfo() {
                return "Sedan driver info";
            }
            void wash() {
                System.out.println("Washing sedan");
            }
        }

        static class Car extends Vehicle {
            @Override
            String getDriverInfo() {
                return "Car driver info";
            }
            void wash() {
                System.out.println("Washing car");
            }
        }

        static class Bicycle extends Vehicle {
            @Override
            String getDriverInfo() {
                return "Bicycle rider info";
            }
            void fold() {
                System.out.println("Folding bicycle");
            }
        }

        public static void main(String[] args) {
            Vehicle[] vehicles = {
                    new Truck(), new Sedan(), new Car(), new Bicycle(),
                    new Truck(), new Sedan(), new Car(), new Bicycle(),
                    new Truck(), new Car() // Total 10 vehicles
            };

            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.getDriverInfo());
                if (vehicle instanceof Truck) {
                    ((Truck) vehicle).loadUp();
                } else if (vehicle instanceof Sedan || vehicle instanceof Car) {
                    if (vehicle instanceof Sedan) {
                        ((Sedan) vehicle).wash();
                    } else {
                        ((Car) vehicle).wash();
                    }
                } else if (vehicle instanceof Bicycle) {
                    ((Bicycle) vehicle).fold();
                }
            }
        }
}
