package lessons.lesson7.personmanagement;

class Person {
    private String name;
    private String surname;
    private int age;
    private boolean married;

    Person(int yearOfBirth, String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = 2024 - yearOfBirth;
        this.married = false;
    }

    void marry(String newSurname, boolean male) {
        this.married = true;
        if (!male) {
            this.surname = newSurname;
        }
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
