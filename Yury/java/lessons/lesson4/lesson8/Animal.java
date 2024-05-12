package lessons.lesson4.lesson8;

public class Animal {
    String name;
    int age;
    String sound;
    double weight;
    boolean isAwake;
    Animal() {
        this.name = "no name";
    }
    Animal (String name) {
        this.name = name;
    }
    String makeSound() {
        return this.sound + "-" + this.sound;
    }
    void wakeUp() {
        if (!this.isAwake) this.isAwake = true;
    }
    void goToSleep () {
        if (this.isAwake) this.isAwake = false;
    }
}
