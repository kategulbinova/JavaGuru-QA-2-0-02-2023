package lessons.lesson4.lesson8;

public class Cat extends Animal {
    Cat (String name) {
        super(name);
        this.sound = "mew";
    }
    void climbTheTree() {
        super.wakeUp();
        System.out.println("I am on the tree!");
    }
}
