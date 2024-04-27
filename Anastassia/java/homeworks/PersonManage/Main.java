package homeworks.PersonManage;

public class Main {
    public static void main(String[] args){

        Person nastya = new Person("Anastassia");
        Person jevgeni = new Person("Jevgeni", 1984);
        System.out.println("New person is " + nastya.name + " age is " + nastya.age );
        System.out.println ("New person is " + jevgeni.name + " age is " + jevgeni.age);

        nastya.setSurname("Shatohhina");
        jevgeni.setSurname("Shatohhin");
        System.out.println("Anastassia's surname is " + nastya.surname);
        System.out.println ("Jevgeni's surname is " + jevgeni.surname);

        if (nastya.age >= 18) nastya.hire();
        if (jevgeni.age >= 18) jevgeni.hire();
        System.out.println("Anastassia is hired: " + nastya.isHired);
        System.out.println ("Jevgeni is hired: " + jevgeni.isHired);


        nastya.makeOlder();
        jevgeni.makeOlder();
        System.out.println("Happy birthday Anastassia! You are now " + nastya.age);
        System.out.println ("Happy birthday Jevgeni! You are now " + jevgeni.age);
    }
}
