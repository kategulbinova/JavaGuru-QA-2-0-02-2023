package lessons.lesson8;

class Cat extends Animal {


    Cat(String name) {
        super(name);
        this.sound = "Meow";
    }
    void climbTheTree(){
        wakeUp();
        System.out.println("Cat is climbing the tree");
    }
}
