package lessons.lesson8;

class Dog extends Animal {

    String breed;

    Dog(String name) {
        super(name);
        this.sound = "Gav";
    }
    void degTheHole(){
        super.wakeUp();
        System.out.println("Dog is digging the hole");
    }
}
