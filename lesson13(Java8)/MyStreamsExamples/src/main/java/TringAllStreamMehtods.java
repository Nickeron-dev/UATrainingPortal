import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TringAllStreamMehtods {
    public static void main(String[] args) {
        int[] array = new int[7];
        System.out.println(Arrays.stream(array).parallel().allMatch((value) -> value == 0));

        List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 5, 2, 6, 7));
        arrayList.forEach(System.out::print);

        System.out.println("\n" + Arrays.asList(1, 3, 5, 9).stream().parallel().anyMatch((value) -> value == 4));

        long timeBefore = System.currentTimeMillis();
        IntStream.rangeClosed(0, 10000).parallel().filter((value) -> (value & 1) != 0).forEach(System.out::println);
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: " + (System.currentTimeMillis() - timeBefore));
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ");
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ");
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ");
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ");
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ");
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ")
        ;System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ");
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ");
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ");
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ");
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ");
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ");
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ");
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ");
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ");
        System.out.println("Parallel PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP stream: ");

        long timeBeforeNormal = System.currentTimeMillis();
        IntStream.rangeClosed(0, 10000).parallel().filter((value) -> (value & 1) != 0).forEach(System.out::println);
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: " + (System.currentTimeMillis() - timeBeforeNormal));
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: ");
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: ");
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: ");
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: ");
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: ");
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: ");
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: ");
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: ");
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: ");
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: ");
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: ");
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: ");
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: ");
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: ");
        System.out.println("NORMAL  LLLLLLLLLLLLLLLLLLLLLLLLLLLLLL stream: ");

        long timeBeforeFor = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            if ((i & 1) != 0) {
                System.out.println(i);
            }
        }
        System.out.println("For: ffffffffffffffffffFFFFFFFFFFFFFFFFFFFFFFFFFFfffff " + (System.currentTimeMillis() - timeBeforeFor));

        int[] newArray = new int[]{1, 4, 5, 5, 1, 2};
        System.out.println(Arrays.toString(Arrays.stream(newArray).distinct().toArray()));

        List<Integer> toList = Arrays.stream(newArray).boxed().collect(Collectors.toList());
        System.out.println(toList);
    }
}
