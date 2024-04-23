package Homeworks.Homework6;

public class ArrayFibo {
    public static void printArray2(int[] myarr){
        for (int i : myarr){
            System.out.print( i +" ");
        }
        System.out.println();
    }

    public static int nF(int x){
        if (x<=1) {
            int y=1;
            return y;
        }
        else  {
            int y =nF(x-2)+nF(x-1);
            return y;
        }
    }

    public static void main (String[] args){
        int[] fibo  = {0,0,0, 0,0,0, 0,0,0, 0,0};
        printArray2(fibo);

        for(int  i=0; i<fibo.length;i++){
            fibo[i] = nF(i);}
        printArray2(fibo);
    }
}
