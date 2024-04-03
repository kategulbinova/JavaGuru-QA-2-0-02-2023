package homeworks.homework6;

public class ChangedLesson6PracticeArray {
     static void printOutArray(int[] arr){
        for (int num : arr)
            System.out.print(num + "; ");
    }
    static void increasingArrayElements(int[] arr, int add){
        for (int i = 0; i < arr.length; i++)
            arr[i] = arr[i] + add;
    }
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 11, -12, 16, 14, -17, 6, 10};
        int add = 5;

        System.out.println("Initial array elements:");
        printOutArray(numbers);
        System.out.println();

        increasingArrayElements(numbers, add);
        System.out.println("Array elements increased by " + add + ": ");
        printOutArray(numbers);
    }
}
