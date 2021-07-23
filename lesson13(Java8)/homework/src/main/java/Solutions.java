import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solutions {
    public static final int MULTIPLY_BY = 3;
    public static void main(String[] args) {
        int [] array = new int[]{9, 5, 0, 7, 1, 3, 0};
        IntStream intStream = Arrays.stream(array);

        OptionalDouble average = intStream.average();
        System.out.println("1.Average: " + average.getAsDouble());

        OptionalInt minValue = Arrays.stream(array).min();
        int index = Arrays.stream(array).boxed().collect(Collectors.toList()).indexOf(minValue.getAsInt());
        System.out.println("2.Min: " + minValue.getAsInt() + " with index: " + index);

        int zeroValuesAmount = (int) Arrays.stream(array).filter((value) -> value == 0).count();
        System.out.println("3.Amount of values equal to 0: " + zeroValuesAmount);

        int valuesLargetThanZero = (int) Arrays.stream(array).filter((value) -> value > 0).count();
        System.out.println("4.Amount of values larget than 0: " + valuesLargetThanZero);

        System.out.print("5.Multiply each element by 3: {");
        Arrays.stream(array).forEach((value) -> {
            System.out.print(" " + value * MULTIPLY_BY + " ");
        });
        System.out.print("}");
    }

    public static int increment(Integer target) {
        target++;
        return target;
    }

}
