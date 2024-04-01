package lessons.lesson4.lesson5;

public class StringNameSurnamePractice {
    public static void main(String[] args) {
        String Name, Surname;
        Name="Yury";
        Surname="Kireev";
        System.out.println(Name + " " + Surname);
        System.out.println(Name.concat(" ").concat( Surname ));
        System.out.println(Surname +", "+ Name);
        System.out.println(Surname.concat(", ").concat( Name));
    }
}
