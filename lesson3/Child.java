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
