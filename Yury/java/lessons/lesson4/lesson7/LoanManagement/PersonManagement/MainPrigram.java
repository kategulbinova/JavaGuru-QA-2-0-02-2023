package lessons.lesson4.lesson7.LoanManagement.PersonManagement;

public class MainPrigram {
    public static void main(String[] args) {
        Person yury = new Person(2000, "Yury","Kireev");
        Person jenna = new Person(2000,"Jenna","Oldridge");

        yury.marry(" ", true );
        jenna.marry("Kireeva", false);

        System.out.println("Yury's surname is " +yury.surname);
        System.out.println("Jenna's surname is " + jenna.surname);
    }
}
