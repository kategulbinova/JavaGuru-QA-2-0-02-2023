package homeworks.homework5;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                var result = i * j;
                System.out.print((result == 1 ? " " : result) + "\t");
            }
            System.out.print('\n');
        }
    }
}
