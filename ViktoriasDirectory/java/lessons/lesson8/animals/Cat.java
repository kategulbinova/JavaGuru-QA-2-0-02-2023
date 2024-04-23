package lessons.lesson8.animals;

import lessons.lesson8.animals.Animal;

public class Cat extends Animal {
    Cat(String name){
        super(name);
        this.sound = "Meow";
    }
    void climbTheTree(){
        super.wakeUp();
        System.out.println("I am on the tree");
    }
}
