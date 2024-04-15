package Homeworks.Homework6;

public class BubbleSort {
    static void printArray(int[] array) {
        for(byte i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    static void bubbleSort(int[] array) {
        int n = array.length;
        for(int i = 0; i < n - 1; i++)
            for(int j = 0; j < n - i - 1; j++)
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
        }
    public static void main(String[] args) {
        int[] array = { 3, 0, 34, 1, 18, 2 };

        printArray(array);
        bubbleSort(array);
        printArray(array);
    }
}
