package Lessons.lesson8.Vehicle;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("JF-992");
        Car nissan = new Car("MC-6645");
        Vehicle myMotorbike = new Vehicle();
        Truck cat = new Truck("AA-001", 4500.00);
        Sedan volvo = new Sedan ("MB-1453",5);
        Bicycle zzk = new Bicycle(12);

        toyota.driver = "Janis";
        nissan.driver = "Peteris";
        myMotorbike.driver = "Liene";
        cat.driver = "Tatjana";
        volvo.driver = "Deniss";
        zzk.driver = "Mark";


        toyota.wash();
        nissan.wash();
        cat.loadUp();
        zzk.fold();

        System.out.println( toyota.getDriverInfo() );
        System.out.println( nissan.getDriverInfo() );
        System.out.println( myMotorbike.getDriverInfo() );
        System.out.println( cat.getDriverInfo() );
        System.out.println( volvo.getDriverInfo() );
        System.out.println( "Seats number is " + volvo.seats);
        System.out.println( "Bicycle speed count is " + zzk.speedCount);

    }
}
