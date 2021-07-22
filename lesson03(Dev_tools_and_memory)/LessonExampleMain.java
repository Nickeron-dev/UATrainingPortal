class First {
        int value = 3;
        void addFive() {
                value += 5;
                System.out.println("first");
        }
}

class Second extends First {
        int value = 2;
        void addFive () {
                value += 5;
                System.out.println("second" + value);
        }
}

public class LessonExampleMain {
        public static void main(String... abc) {
                First f = new Second();
                f.addFive();
                System.out.println(f.value);
        }
}
