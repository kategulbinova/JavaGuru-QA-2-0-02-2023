package lesson7.PersonManagement;

 class Main {
    public static void main(String[] args) {
        Person kate = new Person(1978, "Jekaterina", "Gulbinova");
        Person john = new Person(1982, "John", "Wick");

        kate.marry(john.surname, false);
        john.marry("", true);

        System.out.println("Kate's surname is: " + kate.surname);
        System.out.println("John's surname is: " + john.surname);

    }
}
