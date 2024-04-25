package lessons.lesson8.vehicleManagement;

public class Bicycle extends Vehicle{

    boolean isFolded; // now is FALSE
    int speedCount;

    public Bicycle(int speedCount){
        // super();
        this.speedCount = speedCount;
    }

    public void fold(){
        this.isFolded = true;
        System.out.println("This bicycle is now folded!");
    }
}
