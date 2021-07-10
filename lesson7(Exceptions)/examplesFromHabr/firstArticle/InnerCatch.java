package classes;

public class InnerCatch {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new RuntimeException();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // Enter
            } finally {
                System.err.print(" 4"); // always enter
            }
            System.err.print(" 5");     // enter
        } catch (Exception e) {
            System.err.print(" 6");     // don't enter - Exception is already caught
        } finally {
            System.err.print(" 7");     // always enter
        }
        System.err.print(" 8");         // enter
    }
}
