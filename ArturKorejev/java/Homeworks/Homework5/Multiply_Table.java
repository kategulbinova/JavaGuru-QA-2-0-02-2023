package Homeworks.Homework5;
public class Multiply_Table {
        public static void main(String[] args) {

        int multiplyable;

        multiplyable = 5;

        int num = multiplyable, i = 1;
        while(i <= 10)
        {
            System.out.printf("%d X %d = %d \n", num, i, num * i);
            i++;
        }
    }
}


