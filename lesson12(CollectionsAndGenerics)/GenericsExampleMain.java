package classes;

public class GenericsExampleMain {
        public static void main(String... args) {
                Generic<Integer> generic = new Generic<>(15); // or Generic<Integer>
                System.out.println(generic.get());

                Generic<String> genStr = new Generic<String>("Hello!");
                System.out.println(genStr.get());
                // generic = genStr; // compile error
        }
}
