package homeworks.homework7;

public class Main {

    // Method check if the age of person is between 18 and 65 and hire or fire them.
    static void personHiring(Person pers){
        if (pers.getAge() >= 18 & pers.getAge() <= 65) {
            pers.hire();
            // System.out.println(person.getName() + " is hired.");
        } else {
            pers.fire();
            // System.out.println(person.getName() + " is " + person.getAge() + " years old and is not eligible for hiring.");
        }
    }
    // Method makes each person in array one year older.
    static void celebrateNewYear(Person[] persArr){
        for (Person person : persArr) {
            person.makeOlder();
        }
    }
    static String makeIsHireToString(Person pers) {
        if (pers.isHired()) {
            return "is hired";
        } else {
            return "is not hired";
        }
    }
    static void printPersonData(Person pers){
        System.out.println(pers.getName() + " " + pers.getSurname() + ", " + pers.getAge() + " " + makeIsHireToString(pers));
    }

    public static void main(String[] args) {

        // Homework 7 REQUIRED
        Person person1 = new Person("Anna");
        Person person2 = new Person("Jana", 1992);
        person1.setSurname("Schulz");
        person2.setSurname("Wagner");
        printPersonData(person1);
        printPersonData(person2);

        // Hire persons.
        personHiring(person1);
        printPersonData(person1);

        personHiring(person2);
        printPersonData(person2);

        // Celebrate birthdays for persons.
        person1.makeOlder();
        printPersonData(person1);

        person2.makeOlder();
        printPersonData(person2);


        // Homework 7 ADDITIONAL.
        System.out.println("***************");

        String[] names = {"Ieva", "Artur", "Alise", "Robert", "Emma", "Mihael", "Sophia", "David", "Viktoria", "Oliver", "Janis", "Lisa"};
        int[] birthYears = {1990, 2020, 1959, 1976, 2007, 1948, 1982, 2024, 1978, 1989, 1959, 2007};
        Person[] people = new Person[12]; // Create an array to hold people

        // Loop to create new objects using constructor based on birthYear value
        // set isHire attribute and print person data.
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(names[i], birthYears[i]);
            personHiring(people[i]);
            printPersonData(people[i]);
        }
        System.out.println("***************");

        // Make people one year older and change isHiring attribute depending on age
        celebrateNewYear(people);
        for (Person person : people) {
            personHiring(person);
            printPersonData(person);
        }
     }
}
