package classes;

public class OuterCatch {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new Exception();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // don't enter - exception has another type
            } finally {
                System.err.print(" 4"); // always enter
            }
            // nothing here will be completed until exception will be caught
            System.err.print(" 5");     // Don't enter - problems
        } catch (Exception e) {
            System.err.print(" 6");     // enter - this type exception
        } finally {
            System.err.print(" 7");     // always enter
        }
        System.err.print(" 8");         // enter - everything is ok
    }
}
