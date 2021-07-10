package classes;

public class HandleErrorInCatch {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) { // catch RuntimeException
            System.err.print(" 2.1");
            try {
                System.err.print(" 2.2");
                if (true) {throw new Error();} // throw new Error
                System.err.print(" 2.3");
                } catch (Throwable t) {   // catch Error
                System.err.print(" 2.4");
            }
            System.err.print(" 2.5");
        } catch (Error e) { // although we have this catch we don't get here
            System.err.print(" 3");
        }
        System.err.println(" 4");
    }
}
