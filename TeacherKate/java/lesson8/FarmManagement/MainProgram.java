package lesson8.FarmManagement;

public class MainProgram {
    public static void main(String[] args) {
        Animal crocodile = new Animal();
        Dog tuzik = new Dog("Tuzik");
        Cat murka = new Cat("Murka");
        Mouse norushka = new Mouse("Mishka-Norushka");

        crocodile.sound = "Klac";

        System.out.println(crocodile.makeSound());
        System.out.println(tuzik.makeSound());
        System.out.println(murka.makeSound());
        System.out.println(norushka.makeSound());

    }
}
