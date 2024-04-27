package homeworks.PersonManage;

public class Person {
    String name;
    String surname;
    int age;
    boolean isHired;

    Person(String name, int yearOfBirth) {
        this.name = name;
        this.age = 2024-yearOfBirth;
    }
    Person(String name) {
        this.name = name;
        this.age = 0;
    }

    void hire() {
        this.isHired = true;
    }
    void fire() {
        this.isHired = false;
    }

    public void makeOlder() {
        this.age++;
    }

    public String getSurname() {
        return surname;
    }
     public void setSurname(String surname){
        this.surname = surname;
     }
}
