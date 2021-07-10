package classes;

public class FramesFourth {
    public static void main(String[] args) {
        System.err.println("#1.in");
        f(); // creating frame and putting on a stack
        System.err.println("#1.out"); // come back and continue
    }

    public static void f() {
        System.err.println(".   #2.in");
        g(); // creating frame and putting on a stack
        System.err.println(".   #2.out"); // come back and continue
    }

    public static void g() {
        System.err.println(".   .   #3.in");
        try {
            h(); // creating frame and putting on a stack
        } catch (Error e) { // catch exception
            System.err.println(".   .   #3.CATCH");  // and work
        }
        System.err.println(".   .   #3.out");  // continue to work
    }

    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error(); // exiting from all and going into throw
        }
        System.err.println(".   .   .   #4.out"); // Skip
    }
}
