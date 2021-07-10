// unhandled exception (You cannot throw and don't say about it)
public class App {
    public static void main(String[] args) { //here must be throw
        throw new Exception(); // тут ошибка компиляции
    }
}

// impossible. we cannot throw in method more than we throw in declaration
public class App {
    public static void main(String[] args) throws IOException {
        throw new Exception(); // тут ошибка компиляции
    }
}

// possible. we can throw in declaration the same as we throw in body
public class App {
    public static void main(String[] args) throws Exception { // предупреждаем о Exception
        throw new Exception(); // и кидаем Exception
    }
}

// possible. We can throw in declaration more than we throw in body
public class App {
    public static void main(String[] args) throws Throwable { // предупреждаем "целом" Throwable
        throw new Exception(); // а кидаем только Exception
    }
}

// possible. We can even throw in declaration and don't throw in body
public class App {
    public static void main(String[] args) throws Exception { // пугаем
        // но ничего не бросаем
    }
}

// unhandled exception. If we throw, everybody must be scared... even if we don't throw any exception
public class App {
    public static void main(String[] args) {
        f(); // тут ошибка компиляции
    }

    public static void f() throws Exception {
    }
}

// possible. So others can throw even more than actially is...
public class App {
    // они пугают целым Throwable
    public static void main(String[] args) throws Throwable {
        f();
    }
    // хотя мы пугали всего-лишь Exception
    public static void f() throws Exception {
    }
}

// possible, because RuntimeException is unchecked
public class App {
    public static void main(String[] args) {
        f();
    }
    public static void f() throws RuntimeException {
    }
}

// possible.
public class App {
    // пугаем ПРЕДКОМ исключений
    public static void main(String[] args) throws IOException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}

// don't need to be thrown, because it is caught
public class App {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            // ...
        }
    }
}

// impossible because we caught subclass but threw superclass
public class App {
    public static void main(String[] args) {
        try {
            throw new Throwable();
        } catch (Exception e) {
            // ...
        }
    }
}

// if you caught partly, you don't need to throw entirely. throw everything you haven't caught
public class App {
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

// impossible
public class App {
    // пугаем Exception
    public static void main(String[] args) throws Exception {
        Throwable t = new Exception(); // и лететь будет Exception
        throw t; // но тут ошибка компиляции
    }
}

// impossible, because Exception is checked and throwable is thrown but not handled
public class App {
    // пугаем Exception
    public static void main(String[] args) throws Exception {
        try {
            Throwable t = new Exception(); // и лететь будет Exception
            throw t; // но тут ошибка компиляции
        } catch (Exception e) {
            System.out.println("Перехвачено!");
        }
    }
}

// possible because Throwable is thrown
public class App {
    // ТЕПЕРЬ пугаем Throwable
    public static void main(String[] args) throws Throwable {
        try {
            Throwable t = new Exception(); // а лететь будет Exception
            throw t;
        } catch (Exception e) { // и мы перехватим Exception
            System.out.println("Перехвачено!");
        }
    }
}
