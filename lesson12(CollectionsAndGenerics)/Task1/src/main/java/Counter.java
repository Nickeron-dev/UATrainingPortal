import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Counter {
    public static void main(String[] args) {
        Integer[] arrayI = {4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7};
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

        HashSet<Integer> set = new HashSet<>(array);
        ArrayList<Integer> arrayNoDuplicates = new ArrayList<>(set);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(array, arrayNoDuplicates);
        System.out.println(map);
       // count(array);
    }
    /*
    public static String count(ArrayList<Integer> array) {
        //Integer number = array.get(0);
        HashSet<Integer> set = new HashSet<>(array);
        ArrayList<Integer> arrayNoDuplicates = new ArrayList<>(set);

        array.forEach(((number) -> {
            try {
                if (number)
            }
        }));
    }
    */

}
