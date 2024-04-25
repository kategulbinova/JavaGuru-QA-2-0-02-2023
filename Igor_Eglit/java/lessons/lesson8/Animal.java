package lessons.lesson8;

class Animal {
    String name;
    int age;
    String sound;
    double weight;
    boolean isAwake;

    Animal(){
        this.name = "Noname";
    }
    Animal(String name){
        this.name = name;
    }
    String makeSound(){
        return this.sound +"-" + this.sound;
    }
    void wakeUp(){
        if (!this.isAwake){
            isAwake = true;
        }
    }
    void goToSleep(){
        if (this.isAwake){
            isAwake = false;
        }
    }
}
