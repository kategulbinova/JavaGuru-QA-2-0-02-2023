package lesson8.AnimalPractice;

public class Cat extends Animal {

    Cat(String name) {
       super(name);
       this.sound = "Meow";
    }
    void  climbTheTree() {
        super.wakeUp();
        System.out.println("I'm on the tree");
    }

}
