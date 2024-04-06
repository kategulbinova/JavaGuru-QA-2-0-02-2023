package Homeworks.Homework6;

public class BubbleSort {
    static void print(int[] array) {
        for(byte i= 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {3, 0, 34, 1, 18, 2};
        print(array);
        int n = array.length;
        // Bubble sort
        for(int i= 0; i< n -1; i++)
            for(int j = 0; j < n -i-1; j++)
                if(array[j] > array[j+1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        print(array);
    }
}
