package homework6;

public class MethodUsageArrayPracticeL6 {
static void printArray(int[]num) {
    for (int i=0; i<num.length; i++) {
        System.out.print(num[i] + ", ");
    }
}
    static void printNewArray(int []num) {
        for (int i=0; i<num.length; i++) {
            System.out.print(num[i]+5 + ", ");
        }
    }

    public static void main(String[] args) {
    int []num= {1,2,3,4,5,6,7,8,9};
        printArray(num);
        System.out.println();
        printNewArray(num);
    }
}
