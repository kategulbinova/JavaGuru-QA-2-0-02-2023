package lessons.lesson4.lesson7.LoanManagement.PersonManagement;

public class Person {
    String name;
    String surname;
    int age;
    boolean married;

    Person (int yearOfBirth, String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = 2024 - yearOfBirth;
    }

    void marry (String newSurname, boolean male) {
        this.married = true;
        if (!male) this.surname = newSurname;
    }
}