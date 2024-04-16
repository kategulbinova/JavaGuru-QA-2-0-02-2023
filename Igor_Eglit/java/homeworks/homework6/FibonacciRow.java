package homeworks.homework6;

class FibonacciRow {
    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }

    private static int[] createFibonacciArray(int[] array) {
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }
    public static void main(String[] args) {

        int fibonacciRowLength = 16;
        printArray(createFibonacciArray(new int[fibonacciRowLength]));
    }
}
