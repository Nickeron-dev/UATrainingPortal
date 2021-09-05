/*
class Parent {

        int x = 2;

}

public class Child extends Parent {
        int x = 3;
        public void print(int x) {
                System.out.println(x);
                System.out.println(this.x);
                System.out.println(super.x);
        }
        public static void main(String... abc) {

                new Child().print(0);

        }

}
*/


class Parent {

        int x = 2;

        public void print() {
                System.out.println(x);
        }

}

public class Child extends Parent {
        int x = 3;
        public static void main(String... abc) {

                new Child().print();

        }

}

/*
class Parent {

        int x = 2;

        public void print() {
                System.out.println(x);
        }

}

public class Child extends Parent {
        int x = 3;
        public void print() {
                System.out.println(x);
        }
        public static void main(String... abc) {

                new Child().print();

        }

}
*/
