package homework7;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("John");
        Person person2 = new Person("Paul", 2000);


        person1.setSurname("Smith");
        person2.setSurname("Smith");


        System.out.println("Initial State:");
        System.out.println(person1);
        System.out.println(person2);


        if (person1.getAge() > 18) {
            person1.hire();
        }
        if (person2.getAge() > 18) {
            person2.hire();
        }

        System.out.println("\nAfter Hiring Check:");
        System.out.println(person1);
        System.out.println(person2);


        person1.makeOlder();
        person2.makeOlder();

        System.out.println("\nAfter Birthday Celebration:");
        System.out.println(person1);
        System.out.println(person2);
    }
}
