package homeworks.homework7;

import java.time.LocalDate;
import java.util.List;


import static java.time.LocalDate.now;

class Main {
    public static void main(String[] args) {

        Person jane = new Person("Jane", 25);
        Person john = new Person("John");
        System.out.println(jane);
        System.out.println(john);
        jane.setSurname("Eglit");
        System.out.println(jane);
        john.setSurname("Eglit");
        System.out.println(john);
        jane.hire();
        System.out.println(jane);
        john.hire();
        System.out.println(john);
        jane.makeOlderByOneYear();
        System.out.println(jane);
        john.makeOlderByOneYear();
        System.out.println(john);
    }
}

class OptionalTask {
    public static void main(String[] args) {

        ListOfPeople listOfPeople = new ListOfPeople();
        String[] names = new String[]
                {"John", "Jane", "Igor", "Ivan", "Vlad", "Vladimir", "Petr", "Vasja", "Masha", "Lena"};
        LocalDate[] yearsOfBirth = new LocalDate[]
                {now(), LocalDate.now().withYear(1995), LocalDate.now().withYear(1990), LocalDate.now().withYear(1985),
                        LocalDate.now().withYear(1980), LocalDate.now().withYear(1955), LocalDate.now().withYear(1959),
                        LocalDate.now().withYear(2007), LocalDate.now().withYear(2010), LocalDate.now().withYear(2015)};
        List<Person> people = listOfPeople.makeListOfPeople(names, yearsOfBirth);

        people.forEach(System.out::println);
        System.out.println();
        people.stream().peek(Person::hireOrFire).forEach(System.out::println);
        System.out.println();
        people.stream().peek(Person::celebrateNewYear).peek(Person::hireOrFire).forEach(System.out::println);
    }
}
