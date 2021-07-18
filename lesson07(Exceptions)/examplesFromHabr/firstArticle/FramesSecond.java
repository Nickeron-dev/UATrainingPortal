package classes;

public class FramesSecond {
    public static void main(String[] args) {
        System.err.println("#1.in");
        f(); // creating frame and putting on a stack
        System.err.println("#1.out"); // SKIP!
    }

    public static void f() {
        System.err.println(".   #2.in");
        g(); // creating frame and putting on a stack
        System.err.println(".   #2.out"); // SKIP!
    }

    public static void g() {
        System.err.println(".   .   #3.in");
        h(); // creating frame and putting on a stack
        System.err.println(".   .   #3.out"); // SKIP!
    }

    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error(); // exiting from all
        }
        System.err.println(".   .   .   #4.out"); // SKIP!
    }
}
