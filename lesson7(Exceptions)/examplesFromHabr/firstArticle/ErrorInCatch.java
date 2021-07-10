package classes;

public class ErrorInCatch {
    public static void main(String[] args) {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) {     // catch RuntimeException
            System.err.print(" 2");
            if (true) {throw new Error();} // throw Error
        }
        System.err.println(" 3");          // skip - Error is comming...
    }
}
