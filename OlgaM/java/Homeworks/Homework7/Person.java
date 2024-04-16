public class Person {

    String name;
    String surname;
    int age;
    boolean isHired;

    Person(String name, int yearOfBirth){
        this.name = name;
        this.age = 2024 - yearOfBirth;

    }

    Person(String name){
        this.name = name;
        this.age = 0;
    }

    void hire(){
        this.isHired = true;
    }

    void fire(){
        this.isHired = false;
    }

    void makeOlder(){
        this.age = age + 1;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


}