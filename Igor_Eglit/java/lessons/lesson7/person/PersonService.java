package lessons.lesson7.person;

public class PersonService {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("John");
        person.setAge(25);
        person.setCity("New York");

        person.move("Los Angeles");

        Person person2 = new Person();
        person2.setName("Jane");
        person2.setAge(30);
        person2.setCity("Chicago");
        person2.yearOfBirth();

        Person person3 = new Person("Jack", 35, "Miami");
        person3.yearOfBirth();
        person3.move("Ocean City");
    }
}
