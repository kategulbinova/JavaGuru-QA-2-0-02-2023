package lessons.lesson8.vehicle;

public class Bicycle extends Vehicle{
    boolean isFolded;
    int speedCount;

    public Bicycle(String brend, int speedCount){
        super(brend);
        this.speedCount = speedCount;
    }
    public void fold(){
        this.isFolded = true;
        System.out.println("Bicycle is folded now");
    }

    public boolean isFolded() {
        return isFolded;
    }

    public void setFolded(boolean folded) {
        isFolded = folded;
    }

    public int getSpeedCount() {
        return speedCount;
    }

    public void setSpeedCount(int speedCount) {
        this.speedCount = speedCount;
    }
}
