package classes;

import java.io.FileNotFoundException;
import java.io.EOFException;

// if you caught partly, you don't need to throw entirely. throw everything you haven't caught
public class AppPartly {
    // EOFException перехватили catch-ом, им не пугаем
    public static void main(String[] args) throws FileNotFoundException {
        try {
            if (System.currentTimeMillis() % 2 == 0) {
                throw new EOFException();
            } else {
                throw new FileNotFoundException(); // wasn't caught so put in throws
            }
        } catch (EOFException e) {
            // ...
        }
    }
}
