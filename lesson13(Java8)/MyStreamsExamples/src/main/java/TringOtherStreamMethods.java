import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TringOtherStreamMethods {
    public static void main(String[] args) {
        System.out.println(Stream.of("-1", "1", "2", "3", "4")
                .map(element -> Integer.valueOf(element))
                .filter(number -> (number & 1) != 0)
                .collect(Collectors.toList()));
        Stream.of(1, 2, 3, 4, 1, 7, 2, 9, 12, 43, 24).limit(5).forEach(System.out::print);

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8, 9);

        List<List<Integer>> lists = Arrays.asList(list1, list2, list3);

        List<Integer> alltogether = lists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(alltogether);

        System.out.println(Stream.of(2, 3, 2, 4).reduce(0, (subtotal, element) -> subtotal + element));
        System.out.println(Stream.of(2, 3, 2, 4).reduce(0, Integer::sum));
        // identity is a starting value

        int x = 5;
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
        System.out.println(x > 2 ? 7 : x < 4 ? 10 : 8);

        Stream.iterate(40, n -> n + 2).limit(20).forEach(System.out::print);
    }
}
