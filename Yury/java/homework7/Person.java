package homework7;

public class Person {
    String name;
    static String surname;
    int age;
    boolean isHired;

    Person (String name, int yearOfBirth) {
        this.name = name;
        this.age = 2024 - yearOfBirth;
    }

    Person (String name) {
        this.name = name;
        this.age = 0;
    }

    void toHire () {
        this.isHired = true;
    }

    void toFire () {
        this.isHired = false;
    }
    void makeOlder () {
        this.age = age + 1;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Person.surname = surname;
    }
}
