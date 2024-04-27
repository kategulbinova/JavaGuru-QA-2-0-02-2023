package Lessons.lesson8.Pets;

public class Dog extends Animal {
    String breed; // Only for Dog objects
    Dog(String name) {
        super(name);
        this.sound = "Woof";
    }

    void digHole(){
        super.makeSound();
        System.out.println("I am digging deep!!!!");
    }
}
