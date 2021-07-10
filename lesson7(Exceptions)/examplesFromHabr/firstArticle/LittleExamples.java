// possible
class App1 {
        public static void main(String... args) throws Throwable{}
}

// impossible
class App {
    public static void main(String[] args) throws String {}
}

// possible
class App {
    public static void main(String[] args) {
        try {
        } catch (Throwable t) {}
    }
}

// impossible
class App {
    public static void main(String[] args) {
        try {
        } catch (String s) {}
    }
}

// possible
class App {
    public static void main(String[] args) {
        // Error - потомок Throwable
        throw new Error();
    }
}

// impossible
class App {
    public static void main(String[] args) {
        throw new String("Hello!");
    }
}

// NullPointerException
class App {
    public static void main(String[] args) {
        throw null;
    }
}

// impossible, because throw and new are independent
class App {
    public static void main(String[] args) {
        Error ref = new Error(); // создаем экземпляр
        throw ref;               // "бросаем" его
    }
}

// StackOverflowError
class App {
    public static void main(String[] args) {
        f(null);
    }
    public static void f(NullPointerException e) {
        try {
            throw e;
        } catch (NullPointerException npe) {
            f(npe);
        }
    }
}

/* 2 possible outputs because System.out is buffered stream, System.err is not.
   might be:
   >> Runtime Error
   >> sout
   OR:
   >> sout
   >> RUNTIME ERROR
*/
public class App {
    public static void main(String[] args) {
        System.out.println("sout");
        throw new Error();
    }
}

// OK
public class App {
    public double sqr(double arg) { // надо double
        return arg * arg;           // double * double - это double
    }
}

// OK (casts)
public class App {
    public double sqr(double arg) { // надо double
        int k = 1;                  // есть int
        return k;                   // можно неявно преобразовать int в double
    }
}

// OK (visible cast)
public class App {
    public double sqr(double arg) { // надо double
        int k = 1;                  // есть int
        return (double) k;          // явное преобразование int в double
    }
}

// impossible
public class App {
    public static double sqr(double arg) {
        return "hello!";
    }
}

// missing return statement
public class App {
    public static double sqr(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg; // если currentTimeMillis() - четное число, то все ОК
        }
        // а если нечетное, что нам возвращать?
    }
}

// It compiles!
public class App {
    public static double sqr(double arg) {
        while (true); // Удивительно, но КОМПИЛИРУЕТСЯ!
    }
}

// You don't need to return
public class App {
    public static double sqr(double arg) {
        throw new RuntimeException();
    }
}

// It won't print
public class App {
    public static void main(String[] args) {
        // sqr - "сломается" (из него "выскочит" исключение),
        double d = sqr(10.0);  // выполнение метода main() прервется в этой строчке и
                               // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
        System.out.println(d); // и печатать нам ничего не придется!
    }
    public static double sqr(double arg) {
        throw new RuntimeException(); // "бросаем" исключение
    }
}

// Missing return
public static int area(int width, int height) {
    if (width < 0 || height < 0) {
        // у вас плохие аргументы, извините
    } else {
        return width * height;
    }
}

// Possible but not the best
public static int area(int width, int height) {
    if (width < 0 || height < 0) {
        return -1; // специальное "неправильное" значение площади
    }
    return width * height;
}

// the best variant
public static int area(int width, int height) {
    if (width < 0 || height < 0) {
        throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
    }
    return width * height;
}
