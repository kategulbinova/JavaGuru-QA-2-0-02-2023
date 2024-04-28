package Homeworks.Homework8;

public class Crossover extends Car {

    boolean fourWheelDrive;

    Crossover(String numberPlate, boolean fourWheelDrive) {
        super(numberPlate);
        this.fourWheelDrive = false;
    }

    void FourWheelDrive() {
        fourWheelDrive = true;
        System.out.println("4x4 is on ");
        fourWheelDrive = false;
        System.out.println("4x4 is off ");
    }

}

