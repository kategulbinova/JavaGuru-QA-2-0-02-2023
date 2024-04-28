package Homeworks.Homework8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

                            Car bmw = new Car("JJ-4231");
                            Bicycle rockMachine = new Bicycle(12);
                            Truck scania = new Truck("TX-9081", 13500);
                            Crossover audiQ7 = new Crossover("HT-6190",true);
                            Car opel = new Car("LV-2099");
                            Truck man = new Truck("XV-4977",7500);
                            Crossover volvoXC60 = new Crossover("FR-1115", false);
                            Bicycle trek = new Bicycle(22);
                            Car toyota = new Car("NR-3213");
                            Car audi = new Car("UC-2129");

                            bmw.driver = "Paul";
                            rockMachine.driver = "John";
                            scania.driver = "Nick";
                            audiQ7.driver = "Sarah";
                            opel.driver = "Maria";
                            man.driver = "Max";
                            volvoXC60.driver = "Harry";
                            trek.driver = "Lucy";
                            toyota.driver = "Mike";
                            audi.driver = "Lisa";

    Vehicle[] variousVehicles = {
            bmw, rockMachine, scania, audiQ7, opel, man, volvoXC60, trek, toyota, audi} ;
    for (Vehicle v : variousVehicles) {
        v.getDriverInfo();
    }

        for (int i = 0; i < variousVehicles.length; i++) {
            System.out.print(variousVehicles[i] + " ;");

    }

}
}

