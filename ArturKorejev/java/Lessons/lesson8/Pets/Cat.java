package Lessons.lesson8.Pets;

public class Cat extends Animal {
    Cat(String name) {
        super(name);
        this.sound = "Meow";
    }

    void clibTheTree() {
        super.wakeUp();
        System.out.println("I am on the tree!");
    }
}
