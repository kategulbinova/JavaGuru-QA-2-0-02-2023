package lessons.lesson4.lesson5;

public class BooleanPractice {
    public static void main(String[] args) {
        Boolean x=true;
        Boolean y=false;
        Boolean result;
        result=!x;
        result = result ^ x;
        result = result && y;
        result = !result;
        System.out.println(result);
    }
}
