package Homeworks.Homework8;

public class Main {
    public static void main(String[] args) {


                            Car bmw = new Car("Black","BMW","Paul");
                            Bicycle rockMachine = new Bicycle("Cherry","Rock Machine","John");
                            Truck scania = new Truck("Navy","Scania","Nick");
                            Crossover audiQ7 = new Crossover("Orange","Audi","Sarah");
                            Car opel = new Car("Blue","Opel","Maria");
                            Truck man = new Truck("Yellow","MAN","Max");
                            Crossover volvoXC60 = new Crossover("Brown","Volvo","Harry");
                            Bicycle trek = new Bicycle("Pink","Trek","Lucy");
                            Car toyota = new Car("Silver","Toyota","Mike");
                            Car audi = new Car("Red","Audi","Lisa");


                            bmw.driver = "Paul";
                            bmw.color = "Black";
                            bmw.brand = "BMW";

                            rockMachine.driver = "John";
                            rockMachine.color = "Cherry";
                            rockMachine.brand = "Rock Machine";

                            scania.driver = "Nick";
                            scania.color = "Navy";
                            scania.brand = "Scania";

                            audiQ7.driver = "Sarah";
                            audiQ7.color = "Orange";
                            audiQ7.brand = "Audi";

                            opel.driver = "Maria";
                            opel.color = "Blue";
                            opel.brand = "Opel";

                            man.driver = "Max";
                            man.color = "Yellow";
                            man.brand = "MAN";

                            volvoXC60.driver = "Harry";
                            volvoXC60.color = "Brown";
                            volvoXC60.brand = "Volvo";

                            trek.driver = "Lucy";
                            trek.color = "Pink";
                            trek.brand = "Trek";

                            toyota.driver = "Mike";
                            toyota.color = "Silver";
                            toyota.brand = "Toyota";

                            audi.driver = "Lisa";
                            audi.color = "Red";
                            audi.brand = "Audi";

    Vehicle[] variousVehicles = {
            bmw, rockMachine, scania, audiQ7, opel, man, volvoXC60, trek, toyota, audi} ;
    for (Vehicle v : variousVehicles) {
        v.getDriverInfo();
    }

        for (int i = 0; i < variousVehicles.length; i++) {
            System.out.print(variousVehicles[i].getDriverInfo() + " ; " );
            System.out.println();

    }

}
}

