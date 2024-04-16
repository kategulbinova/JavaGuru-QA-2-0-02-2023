package lesson8.VehicleManagement;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("JF-992");
        Car nissan = new Car("MC-6645");
        Vehicle myMotorbike = new Vehicle();
        Truck cat = new Truck("AA-001", 4500.00);
        Sedan yaris = new Sedan("MB-1453", 5);
        Bicycle aist = new Bicycle(1);

        toyota.driver = "Janis";
        nissan.driver = "Peteris";
        myMotorbike.driver = "Liene";
        cat.driver = "Tatjana";
        yaris.driver = "Deniss";
        aist.driver = "Marina";

        toyota.wash();
        nissan.wash();
        cat.wash();
        cat.loadUp();
        aist.fold();
        System.out.println( toyota.getDriverInfo() );
        System.out.println( nissan.getDriverInfo() );
        System.out.println( myMotorbike.getDriverInfo() );
        System.out.println( cat.getDriverInfo() );
        System.out.println( yaris.getDriverInfo() );
        System.out.println( aist.getDriverInfo() );
    }
}
