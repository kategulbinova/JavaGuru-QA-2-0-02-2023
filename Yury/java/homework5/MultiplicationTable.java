package homework5;

public class MultiplicationTable {
    public static void main(String[] args) {
        int Num=5, a, Result;
        for (a=0; a<=10; a++) {
            Result = Num * a;
            System.out.println(Num + "*" + a + "=" + Result);
        }
    }
}
