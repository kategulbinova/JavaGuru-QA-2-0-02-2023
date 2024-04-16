package homeworks.homework7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class ListOfPeople {

    public List<Person> makeListOfPeople(String [] name, LocalDate[] yearOfBirth){
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            people.add(new Person(name[i], yearOfBirth[i]));
        }
        return people;
    }
}
