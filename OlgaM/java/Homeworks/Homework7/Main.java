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
        System.out.println(candidate.getName() + " " + candidate.getSurname() + " age is " + candidate.getAge() );

    }
    static void printPersonsHiringCondition(Person candidate) {
        System.out.println(candidate.getName() + " " + candidate.getSurname() + " " + printIsHire(candidate));
    }


    public static void main(String[] args) {

        Person person1 = new Person("Oliver");
        Person person2 = new Person("Christopher",1970);

        person1.setSurname("Nolan");
        person2.setSurname("Nolan");

        System.out.println("********************** Initial Persons Age **********************" );

        printNameAndAge(person1);
        printNameAndAge(person2);

        System.out.println("***************** Persons one year older *****************" );

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