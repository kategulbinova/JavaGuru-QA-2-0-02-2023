package lessons.lesson5;

public class MyNameAndSurname {
    public static void main(String[] args) {
            String name = " Olga";
            String Surname = "Bogdanova";
        System.out.println(name + " " + Surname + " " + name);
        System.out.println(name.concat(" ").concat ( Surname));
        System.out.println(Surname + "," + name);
        System.out.println(Surname.concat(",").concat(",,,").concat (name));



    }
}
