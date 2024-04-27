package homeworks.VehicleManage;

public class Main {
    public static void main(String[] args){
        Car toyota = new Car("430-MHJ");
        Car nissan = new Car("844-ABC");
        Vehicle myMotorbike = new Vehicle();
        Truck cat = new Truck("DSA-949", 4500.00);
        Sedan yaris = new Sedan("NHY-334", 5);
        Bicycle aist = new Bicycle(5);
        Vehicle scooter = new Vehicle();
        Vehicle boat = new Vehicle();
        Vehicle stroller = new Vehicle();
        Vehicle airplane = new Vehicle();


        Vehicle[] vehicles = { toyota, nissan, cat, myMotorbike, yaris, aist, scooter, boat, stroller, airplane};

        toyota.driver = "Ivan";
        cat.driver = "Fedor";
        aist.driver = "Nastja";
        nissan.driver = "Denis";
        myMotorbike.driver = "Lena";
        yaris.driver = "Irina";
        scooter.driver = "Nikita";
        boat.driver = "Evgeni";
        stroller.driver = "Oksana";
        airplane.driver = "John";

        for (Vehicle v: vehicles) {
            System.out.println(v.getDriverInfo());
        }

        for (Vehicle v: vehicles) {
            if (v instanceof Truck)
                ((Truck) v).loadUp();
            else if (v instanceof Bicycle)
                ((Bicycle) v).fold();
            else if(v instanceof Car)
                ((Car) v).wash();
            else
                v.fix();
        }

    }

}
