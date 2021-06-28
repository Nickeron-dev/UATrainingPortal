/*
        Required output:

        0 1 2 3 4
        0 1 2 3
        0 1 2
        0 1
        0

*/

package classes;

public class Task2 {

        public static void main(String[] args) {

                int[] arr = {0, 1, 2, 3, 4};

                for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr.length - i; j++) {
                                System.out.print(arr[j]);
                        }
                        System.out.println();
                }
                
        }

}
