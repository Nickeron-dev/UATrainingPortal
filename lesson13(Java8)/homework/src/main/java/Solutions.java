import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solutions {

    public static final int MULTIPLY_BY = 3;

    public static void main(String[] args) {
        int [] array = new int[]{9, 5, 0, 7, 1, 3, 0};

        System.out.println("1.Average: " + average(array));

        System.out.println("2.Min: " + minValue(array) + " with index: " + getIndex(array, minValue(array)));

        System.out.println("3.Amount of values equal to 0: " + zeroValuesAmount(array));

        System.out.println("4.Amount of values larget than 0: " + valuesLargerThanZero(array));

        System.out.print("5.Multiply each element by 3: {" + multiplyArrayByValue(array, MULTIPLY_BY) + "}");
    }


    public static double average(int[] array) {
        IntStream intStream = Arrays.stream(array);
        OptionalDouble average = intStream.average();
        return average.getAsDouble();
    }


    public static int minValue(int[] array) {
        OptionalInt minValue = Arrays.stream(array).min();
        return minValue.getAsInt();
    }

    public static int getIndex(int[] array, int element) {
        return Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList())
                .indexOf(element);
    }

    public static int zeroValuesAmount(int[] array) {
        return (int) Arrays.stream(array).filter((value) -> value == 0).count();
    }

    public static int valuesLargerThanZero(int[] array) {
        return (int) Arrays.stream(array).filter((value) -> value > 0).count();
    }

    public static String multiplyArrayByValue(int[] array, int number) {
        StringBuffer temp = new StringBuffer("");
        Arrays.stream(array).forEach((value) -> {
            temp.append(" " + value * number + " ");
        });
        String result = new String(temp);
        return result;
    }
}
