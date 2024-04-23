package lessons.lesson8.vehiclesManagement;

public class Bicycle extends Vehicle{

    boolean isFolded; // now is FALSE
    int speedCount;

    Bicycle(int speedCount){
        //super();
        this.speedCount = speedCount;
    }

    void fold(){
        this.isFolded = true;
        System.out.println("This bicycle is now folded!");
    }
}
