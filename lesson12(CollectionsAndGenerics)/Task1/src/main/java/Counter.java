import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Counter {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(15);
        array.add(4);
        array.add(5);
        array.add(-6);
        array.add(4);
        array.add(5);
        array.add(3);
        array.add(4);
        array.add(2);
        array.add(4);
        array.add(5);
        array.add(7);

        System.out.println(count(array));
    }

    public static String count(ArrayList<Integer> array) {
        HashSet<Integer> set = new HashSet<>(array);
        ArrayList<Integer> arrayNoDuplicates = new ArrayList<>(set);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(arrayNoDuplicates.size(), arrayNoDuplicates.size());
        array.forEach((number) -> {
            try {
                int alreadyValue = map.get(number);
                map.put(number, alreadyValue + 1);
            } catch (Exception exc) {
                map.put(number, 1);
            }
        });
        return map.toString();
    }


}
