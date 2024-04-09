package lessons.lesson6;

class IncrementArrayElements {
    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    private static int[] increaseElementsOfArrayByIncrement(int[] array, int increment) {
        for (int i = 0; i < array.length; i++) {
            array[i] += increment;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] numbers = {45, 87, 23, 2, -15, 67, 1005, -1235, -1076652, 0};
        printArray(numbers);
        int increment = 5;
        printArray(increaseElementsOfArrayByIncrement(numbers, increment));
    }
}
