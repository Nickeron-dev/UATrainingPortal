package classes;

public class Frames {
    public static void main(String[] args) {
        System.err.println("#1.in");
        f(); // creating frame and putting on a stack
        System.err.println("#1.out"); // come back
} // exiting from it, ended

    public static void f() {
        System.err.println(".   #2.in");
        g(); // creating frame and putting on a stack
        System.err.println(".   #2.out");  // come back
    } // exiting from it, ended

    public static void g() {
        System.err.println(".   .   #3.in");
        h(); // creating frame and putting on a stack
        System.err.println(".   .   #3.out"); // come back
    } // exiting from it, ended

    public static void h() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.RETURN");
            return; // выходим из текущего фрейма по 'return'
        }
        System.err.println(".   .   .   #4.out"); // Skip
    }
}
