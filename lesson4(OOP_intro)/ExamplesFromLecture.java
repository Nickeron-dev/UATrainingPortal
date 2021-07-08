import java.util.Arrays;

public class ExamplesFromLecture {

        public static void main(String[] args) {

                MyClass obj1 = new MyClass(2, 5);
                MyClass obj2 = new MyClass(2, 5);

                // instanceof usage
                System.out.println("Instanceof MyClass result: " +
                        (obj1 instanceof MyClass));
                System.out.println("Instanceof MySuperClass result: " +
                        (obj1 instanceof MySuperClass));
                System.out.println("=====================");

                // getClass() and GetName() usage
                Class obj2Class = obj2.getClass();
                System.out.println("getClass() of MyClass(2, 5): " +
                        obj2.getClass().getName());
                System.out.println("=====================");

                // hashCode()
                System.out.println("HashCode of obj1: " + obj1.hashCode());
                System.out.println("HashCode of obj2: " + obj2.hashCode());
                System.out.println("=====================");

                // All ways to create an array
                int [] array1 = new int[5];
                int array2 [] = new int[5];
                int [] array3 = new int[] {1, 2, 3};
                int array4 [] = {1, 2, 3};

                int [][] twoDimensionalArray = new int [3][5];
                int counter = 14;
                for (int i = twoDimensionalArray.length - 1; i >= 0; i--) {
                        for (int j = twoDimensionalArray[i].length - 1; j >= 0; j--) {
                                twoDimensionalArray[i][j] = counter--;
                        }
                }

                System.out.println("Array: " + Arrays.deepToString(twoDimensionalArray));

        }

}
