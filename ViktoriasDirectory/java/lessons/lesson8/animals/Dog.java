package lessons.lesson8.animals;

import lessons.lesson8.animals.Animal;

public class Dog extends Animal {
    String breed; // Only for dog
    Dog(String name){
        super(name);
        this.sound = "Woof";
    }
    void digHole(){
        super.makeSound();
        System.out.println("I am digging deep!!!");
    }

}
