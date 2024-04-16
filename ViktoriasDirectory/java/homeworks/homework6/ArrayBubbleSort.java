package homeworks.homework6;

import java.util.Scanner; //Import Scanner class

public class ArrayBubbleSort {

    static int getArrayElementsNumber(){
        System.out.print("Enter the number of array elements: ");
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt(); // Read user input for array elements number
        scanner.close();

        return arrSize;
    }
    static void fillAnArray(int[] arr){
        for (int i = 0; i < arr.length; i++)
            // Getting random numbers from 0 to 100
            arr[i] = (int)(Math.random() * 101);
    }
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    static void printOutArray(int[] arr){
        for (int num : arr)
            System.out.print(num + "; ");
    }

    public static void main(String[] args) {

        int[] numbersArray = new int[getArrayElementsNumber()];
        fillAnArray(numbersArray);
        System.out.println("Initial array: ");
        printOutArray(numbersArray);

        System.out.println();

        bubbleSort(numbersArray);
        System.out.println("Sorted array: ");
        printOutArray(numbersArray);
    }
}
