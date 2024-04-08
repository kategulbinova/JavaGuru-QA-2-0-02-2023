
package Homeworks.Homework6;


    public class IncrArrayElements {

        static void printArray(int[] array) {
            for (int a = 0; a < array.length; a++) {
                System.out.print(array[a] + " ;");
            }

        }

        static void incrArrayElements(int[] array, int add) {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] + add;
            }
        }


        public static void main(String[] args) {

            int[] numbers = {8, 3, 7, 15, 73, 59, 22, 0, 81, 64};
            int add = 5;
            System.out.println("Array numbers:");
            printArray(numbers);
            System.out.println();
            incrArrayElements(numbers,add);
            System.out.println("Array numbers increased on " + add + ":");
            printArray(numbers);
        }
    }























