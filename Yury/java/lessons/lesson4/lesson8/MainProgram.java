package lessons.lesson4.lesson8;

public class MainProgram {
    public static void main(String[] args) {
        Animal crocodile = new Animal();
        Dog tuzik = new Dog ("Tuzik");
        Cat murka = new Cat ("Murka");

        crocodile.sound = "Klac";
        System.out.println(crocodile.makeSound());
        System.out.println(tuzik.makeSound());
        System.out.println(murka.makeSound());
    }
}
