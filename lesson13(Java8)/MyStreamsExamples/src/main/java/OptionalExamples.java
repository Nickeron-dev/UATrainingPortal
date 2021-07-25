import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        System.out.println(optional);

        //optional = Optional.of(null); // NullPointer
        optional = Optional.ofNullable(null);
        System.out.println(optional.isPresent());
        //System.out.println(optional.get()); // NoSuchElementException

        System.out.println(optional.orElse("none"));
        System.out.println(optional.orElseGet(() -> "noneOrElseGet")); // so they don't put
        System.out.println(optional);
        //optional.orElseThrow(() -> new NoSuchElementException());

        Optional<String> str = Optional.ofNullable("Hello").map(element -> element.toUpperCase());
        System.out.println(str);


    }

}
