package classes;

public class NoCatch {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new Error();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // don't enter - another exception
            } finally {
                System.err.print(" 4"); // always enter
            }
            System.err.print(" 5");     // don't enter - exception wasn't caught
        } catch (Exception e) {
            System.err.print(" 6");     // don't enter - another exception
        } finally {
            System.err.print(" 7");     // always enter
        }
        System.err.print(" 8");         // don't enter - exception wasn't caught
    }
}
