package lessons.lesson7.personManagement;

public class Main {
    public static void main(String[] args) {
        Person female1 = new Person(1984, "Anna", "Port");
        Person male1 = new Person(1982, "Nikita", "Test");

        female1.marry("Test", false);
        male1.marry("", true);

        System.out.println("Her surname is: " + female1.surname);
        System.out.println("His surname is: " + male1.surname);
    }
}
