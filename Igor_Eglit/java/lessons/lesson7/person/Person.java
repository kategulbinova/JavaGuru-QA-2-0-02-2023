package lessons.lesson7.person;

import java.time.LocalDate;

class Person {
    private String name;
    private int age;
    private String city;

    Person(){
        name = "Unknown";
        age = 0;
        city = "Unknown";
    }
    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    void setName(String newName) {
        name = newName;
    }
    void setAge(int newAge) {
        age = newAge;
    }
    void setCity(String newCity) {
        city = newCity;
    }
    public void yearOfBirth() {
        System.out.println(name + " was born in " +
                (LocalDate.now().getYear() - age)+
                " in " + city);
    }

    public void move(String newCity) {
        city = newCity;
        System.out.println(name + " moved to " + city);
    }

}
