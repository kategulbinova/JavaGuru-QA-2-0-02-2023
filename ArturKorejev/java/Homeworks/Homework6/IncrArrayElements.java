
package Homeworks.Homework6;

import java.util.Random;
    public class IncrArrayElements {
        public static void main(String[] args) {
            int[] array = new int[10]; // qty of numbers in array
            int add = 5; // add + to each number from array
            Random rand = new Random();
                    System.out.println("========= Random numbers: =========");
            for (byte i = 0; i < array.length; i++) {
                array[i] = rand.nextInt(90); // random numbers from 0 till 90
                    System.out.print(array[i] + " ;");
            }
                    System.out.println();

                for (int j = 0; j < array.length; j++) {
                    array[j] = array[j] + add;
                }
                    System.out.println("========= Random numbers +" + add + " : =========");
                for (int k = 0; k < array.length; k++) {

                    System.out.print(array[k] + " ;");

                }
            }
        }


