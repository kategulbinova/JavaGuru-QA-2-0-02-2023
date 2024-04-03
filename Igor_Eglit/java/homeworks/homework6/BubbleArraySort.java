package homeworks.homework6;

public class BubbleArraySort {
    private static void printArray(int[] array, String message) {
        System.out.println(message);
        for (int element : array) {
            System.out.print(element + " " + '\t');
        }
        System.out.println();
    }
    private static int[] sortArrayAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    private static int[] sortArrayDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    private static int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    public static void main(String[] args) {
        int arrayLength = 10;
        int[] initialArray = createArray(arrayLength);
        printArray(initialArray, "Print initial array");
        int[] sortedArray = sortArrayAsc(initialArray);
        printArray(sortedArray, "Print sorted Asc array");
        int [] sortedDescArray = sortArrayDesc(initialArray);
        printArray(sortedDescArray, "Print sorted Desc Array");
    }
}
