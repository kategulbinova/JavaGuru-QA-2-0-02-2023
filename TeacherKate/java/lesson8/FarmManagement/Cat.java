package lesson8.FarmManagement;

public class Cat extends Animal {
    public static int howManyCats = 0;

    Cat(String name) {
        super(name);
        this.sound = "Meow";
        howManyCats++;
    }

    void climbTheTree() {
        super.wakeUp();
        System.out.println("I am on the tree!");
    }
}
