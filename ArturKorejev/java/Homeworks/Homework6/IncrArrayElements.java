
package Homeworks.Homework6;

import java.util.Random;
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






















        /*static void randomArrayGenerator() {
            int[] array = new int[10]; // qty of numbers in array
            Random rand = new Random();
            System.out.println("========= Random numbers: =========");
            for (byte i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(90); // random numbers from 0 till 90
                System.out.print(array[i] + " ;");
            }

        }

        public static void main(String[] args) {

             randomArrayGenerator();



        }
    }


            }
            System.out.println();
int add = 5; // add + to each number from array
                for (int j = 0; j < array.length; j++) {
                    array[j] = array[j] + add;
                }
                    System.out.println("========= Random numbers +" + add + " : =========");
                for (int k = 0; k < array.length; k++) {

                    System.out.print(array[k] + " ;");
*/




