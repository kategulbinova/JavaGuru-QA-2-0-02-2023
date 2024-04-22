package lessons.lesson8;

public class Main {

    public static void main(String[] args) {
        Animal crocodile = new Animal("Crocodile");
        Dog tuzik = new Dog("Tuzik");
        Cat murka = new Cat("Murka");
        Mouse jerry = new Mouse("Jerry");

        crocodile.sound= "Grrr";
        System.out.println(crocodile.makeSound());
        crocodile.goToSleep();
        tuzik.breed = "Dalmatian";
        tuzik.degTheHole();
        murka.climbTheTree();
        System.out.println(jerry.makeSound());
    }
}
