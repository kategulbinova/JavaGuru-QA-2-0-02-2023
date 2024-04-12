package homeworks.homework7;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean isHired;

    Person(String name){
        this.name = name;
        this.age = 0;
    }
    Person(String name, int yearOfBirth){
        this.name = name;
        this.age = java.time.Year.now().getValue() - yearOfBirth;
    }

    void hire(){
        this.isHired = true;
    }
    void fire(){
        this.isHired = false;
    }
    void makeOlder(){
        this.age ++;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public boolean isHired(){
        return this.isHired;
    }

}
