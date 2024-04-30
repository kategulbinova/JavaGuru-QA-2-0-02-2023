package homework7;

import java.time.LocalDate;

public class Person {
    private final String name;
    private String surname;
    private int age;
    private boolean isHired;


    public Person(String name, int birthYear) {
        this.name = name;
        this.age = LocalDate.now().getYear() - birthYear;
        this.isHired = false;
    }

    public Person(String name) {
        this(name, LocalDate.now().getYear());
    }


    public void hire() {this.isHired = true;}

    public void fire() {this.isHired = false;}

    public void makeOlder() {
        this.age += 1;
    }

    public String getSurname() {return this.surname;}

    public void setSurname(String surname) {this.surname = surname;}

    public int getAge() {return this.age;}

    public boolean isHired() {return this.isHired;}

    public String getName() {return this.name;}

    @Override
    public String toString() {
        return this.name + " " + this.surname + " is " + this.age + " years old and " + (this.isHired ? "hired" : "not hired");
    }
}
