package homework7;

public class MainProgram {
    public static void main(String[] args) {
        Person person1 = new Person("Yury");
        Person person2 = new Person("Jurijs", 2000);
        System.out.println("New person is " + person1.name + " age is " + person1.age );
        System.out.println ("New person is " + person2.name + " age is " + person2.age);

        person1.setSurname("Kireev");
        person2.setSurname("Kirejevs");
        System.out.println("Yury's surname is "+ person1.surname);
        System.out.println("Jurijs's surname is " + person2.surname);

        if (person1.age >= 18) person1.toHire();
        if (person2.age >= 18) person2.toHire();
        System.out.println("Is a person hired? Answer - " + person1.isHired);
        System.out.println("Is a person hired? Answer - " + person2.isHired);

        person1.makeOlder();
        person2.makeOlder();
        System.out.println("Happy birtday! You are now: " + person1.age);
        System.out.println("Happy birthday! You are now: " + person2.age);
    }
}
