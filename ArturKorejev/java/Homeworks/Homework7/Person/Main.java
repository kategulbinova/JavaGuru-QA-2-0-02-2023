package Homeworks.Homework7.Person;

public class Main {
    static void personHiring(Person candidate){
        if ( candidate.getAge() >= 18 ) {
            candidate.hire();
        } else {
            candidate.fire();
        }
    }

    static String printIsHire(Person candidate) {
        if (candidate.isHired) {
            return "is hired";
        } else {
            return "is not hired";
        }
    }
    static void printNameAndAge(Person candidate) {
        System.out.println(candidate.getName() + " " + candidate.getSurname() + ", " + candidate.getAge() );

    }
    static void printPersonsHiringCondition(Person candidate) {
        System.out.println(candidate.getName() + " " + printIsHire(candidate));
    }


    public static void main(String[] args) {

        Person person1 = new Person("John");
        Person person2 = new Person("Paul",2007);

        person1.setSurname("Smith");
        person2.setSurname("Smith");

        System.out.println("********************** Initial Persons Age **********************" );

        printNameAndAge(person1);
        printNameAndAge(person2);

        System.out.println("***************** Persons Growing up on one year *****************" );

        person1.makeOlder();
        person2.makeOlder();

        printNameAndAge(person1);
        printNameAndAge(person2);

        personHiring(person1);
        personHiring(person2);

        printPersonsHiringCondition(person1);
        printPersonsHiringCondition(person2);

    }



}
