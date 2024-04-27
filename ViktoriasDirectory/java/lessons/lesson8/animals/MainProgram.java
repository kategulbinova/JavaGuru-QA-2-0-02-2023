package lessons.lesson8.animals;

import lessons.lesson8.animals.Animal;
import lessons.lesson8.animals.Cat;
import lessons.lesson8.animals.Dog;
import lessons.lesson8.animals.Mouse;

public class MainProgram {
    public static void main(String[] args) {
        Animal crocodile = new Animal();
        Dog tuzik = new Dog("Tuzik");
        Cat murka = new Cat("Murka");
        Mouse mausy = new Mouse("Mausy");

        crocodile.goToSleep();
        crocodile.sound = "Klac";

        System.out.println(crocodile.makeSound());
        System.out.println(tuzik.makeSound());
        System.out.println(murka.makeSound());
        System.out.println(mausy.makeSound());

        tuzik.digHole();
        murka.climbTheTree();
    }
}
