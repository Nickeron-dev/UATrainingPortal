package classes;

public class App {
    // Scaring with Throwable
    public static void main(String[] args) throws Throwable {
        try {
            Throwable t = new Exception(); // Exception will be
            throw t;
        } catch (Exception e) { // catch Exception but the reference is to Throwable
            System.out.println("Перехвачено!");
        }
    }
}
