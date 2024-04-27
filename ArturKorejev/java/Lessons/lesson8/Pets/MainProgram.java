package Lessons.lesson8.Pets;

public class MainProgram {
    public static void main(String[] args) {
        Animal crocodile = new Animal();
        Dog tuzik = new Dog("Tuzik");
        Cat murka = new Cat("Murka");
        Mouse jerry = new Mouse("Jerry");

        crocodile.goToSleep();
        tuzik.breed ="Italian Greyhound";
        tuzik.digHole();
        murka.clibTheTree();

        crocodile.sound = "Klac";

        System.out.println(tuzik.makeSound());
        System.out.println(crocodile.makeSound());
        System.out.println(murka.makeSound());
        System.out.println(jerry.makeSound());


    }
}
