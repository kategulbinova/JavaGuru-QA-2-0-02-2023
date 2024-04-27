package lesson8.AnimalPractice;

public class MainProgramm {
    public static void main(String[] args) {
        Animal crocodile = new Animal();
        Dog tuzik = new Dog("Tuzik");
        Cat murka = new Cat ("Murka");
        Mouse norushka = new Mouse("Myshka-norushka");

        crocodile.sound = "Klac";

        System.out.println(crocodile.makeSound());
        System.out.println(tuzik.makeSound());
        System.out.println(murka.makeSound());
        System.out.println(norushka.makeSound());

        crocodile.goToSleep();
        tuzik.breed = "Italian Greyhound";
        tuzik.digHole();
        murka.climbTheTree();
    }
}
