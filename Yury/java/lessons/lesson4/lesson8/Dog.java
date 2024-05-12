package lessons.lesson4.lesson8;

public class Dog extends Animal {
    String breed;
    Dog (String name) {
        super(name);
        this.sound = "woof";
    }
    void digHole () {
        super.makeSound();
        System.out.println("I am digging deep!!");
    }
}
