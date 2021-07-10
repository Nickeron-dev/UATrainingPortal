package classes;

public class Demo {

    public static void test(ParentB ref) {
        // compiles because Parent has Exception
        try {
            ref.f();
        } catch(Exception e) {}
    }

    public static void main(String... args) {
        // compiles but since ChildB had Throwable there could have been a mistake
        Demo.test(new ChildB());
    }

}
