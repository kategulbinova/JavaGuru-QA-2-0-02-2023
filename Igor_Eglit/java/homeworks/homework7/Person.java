package homeworks.homework7;

import java.time.LocalDate;

class Person {

    private String name;
    private String surname;
    private int age;
    private LocalDate yearOfBirth;
    private boolean isHired;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.surname = "no surname";
    }

    Person(String name) {
        this.name = name;
        this.age = 0;
        this.surname = "no surname";
    }

    Person(String name, LocalDate yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        this.age = LocalDate.now().getYear() - yearOfBirth.getYear();
        this.name = name;
    }

    void makeOlderByOneYear() {
        setAge(getAge() + 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isHired() {
        return isHired;
    }

    public void setHired(boolean hired) {
        isHired = hired;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(LocalDate yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Person: " + name + '\t'+
                ", " + surname + '\t' +
                ", age " + age + '\t' +
                ", isHired " + isHired +'\t';
    }
}
