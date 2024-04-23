package Homeworks.Homework6;

public class ArrayClassFive {
    public static void increase5(int x[])
    {
        for ( int i=0; i< x.length; i++){
            x[i]=x[i]+5;
        }
    }

    public static void printArray(int x[])
    {
        for ( int i=0; i< x.length; i++){
            System.out.print(x[i]+" ");
        }
    }

    public static void main( String[] args )
    {
        int[] num = { 45,87,23,2,-15,67,1005,-1235,-1076652};

        printArray(num);
        System.out.println();

        increase5(num);
        printArray(num);
    }
}

