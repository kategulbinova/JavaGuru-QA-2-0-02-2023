package lesson8.AnimalPractice;

public class Dog extends Animal {
   String breed; //only for dogs
    Dog(String name) {
        super(name);
        this.sound  = "Woof";
    }
    void digHole(){
        super.makeSound();
        System.out.println("I am digging deep!!!");
    }
}
