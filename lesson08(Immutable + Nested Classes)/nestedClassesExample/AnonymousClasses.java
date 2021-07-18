package classes;

class Anonymous {

        void printAnonymous() {
                System.out.println("Anonymous");
        }

        void printHello() {
                System.out.println("hello");
        }

}

public class AnonymousClasses {
        public static void main(String... args) {
                Anonymous anonym = new Anonymous() { // this is Anonymous class

                        @Override
                        void printAnonymous() {
                                System.out.println("hello, anonymous class");
                        }

                };
                anonym.printAnonymous();
                anonym.printHello();

                Comparable compare = new Comparable() {

                        @Override
                        public int compareTo(Object o) {
                                return 0;
                        }

                };

                System.out.println(compare.compareTo(new Object()));
        }
}
