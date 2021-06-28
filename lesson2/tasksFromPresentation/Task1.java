/*
        Required output:

        0 0 0 0 0
        1 1 1 1
        2 2 2
        3 3
        4

*/

public class Task1 {

        public static void main(String[] args) {

                int[] arr = {0, 1, 2, 3, 4};

                for (int i = 0; i < arr.length; i++) {
                        int printTimes = arr[arr.length - (i + 1)]; // last element

                        for ( ; printTimes >= 0; printTimes--) {
                                System.out.print(arr[i]);
                        }
                        System.out.println();

                }
        }

}
