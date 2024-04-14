package Lessons.lesson7.PersonManagement;

public class Main {
    public static void main(String[] args) {
        Person kate = new Person(1978,"Jekaterina","Gulbinova");
        Person john = new Person(1982,"John","Doe");

        kate.marry("Fjodorova",false);
        john.marry("",true);


    }
}
