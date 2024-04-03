package homeworks.homework5;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int number = 1; number < 101; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(number);
            }
        }
    }
}
class FizzBuzzSwitch{
    public static void main(String[] args) {
        for (int number = 1; number < 101; number++) {
            switch (number % 15) {
                case 0 -> System.out.println("FizzBuzz");
                case 3, 6, 9, 12 -> System.out.println("Fizz");
                case 5, 10 -> System.out.println("Buzz");
                default -> System.out.println(number);
            }
        }
    }
}


