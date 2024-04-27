package Lessons.lesson8.Vehicle;

public class Bicycle extends Vehicle {

    boolean isFolded;
    int speedCount;

    Bicycle(int speedCount) {
        super();
        this.isFolded = false;
        this.speedCount = speedCount;
    }
    void fold() {
        isFolded = true;
        System.out.println("This bicycle is now folded");
    }

}
