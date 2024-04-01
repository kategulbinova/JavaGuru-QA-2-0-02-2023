package homeworks.homework5;

public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 7; // Change this to the desired number

        System.out.println("Multiplication Table for " + number + ":");
        System.out.println("-------------------------");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
