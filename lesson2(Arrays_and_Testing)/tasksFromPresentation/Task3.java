/*
        Required output:

        0 1 2 3 4
        1 2 3 4
        2 3 4
        3 4
        4

*/

package classes;

public class Task3 {

        public static void main(String[] args) {

                int[] arr = {0, 1, 2, 3, 4};

                for (int i = 0; i < arr.length; i++) {
                        for (int j = i; j < arr.length; j++) {
                                System.out.print(arr[j]);
                        }
                        System.out.println();
                }

        }

}
