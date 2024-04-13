package lessons.lesson7.personmanagement;

class Main {
    public static void main(String[] args) {
        Person kate = new Person(1978, "Kate", "Gulbinova");
        Person john = new Person(1975, "John", "Doe");

        kate.marry(john.getSurname(), false);
        john.marry("", true);
        System.out.println(kate.getName() + " " + kate.getSurname() + " is married: " + kate.isMarried());
        System.out.println(john.getName() + " " + john.getSurname() + " is married: " + john.isMarried());
    }
}
