package classes;

public class WorkWithExcInCatch {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                RuntimeException re = (RuntimeException) e;
                System.err.print("It's RuntimeException!!!");
            } else {
                System.err.print("Are you sure that it is RuntimeException???");
            }
        }
    }
}
