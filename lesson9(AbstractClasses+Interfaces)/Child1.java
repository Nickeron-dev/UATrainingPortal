package classes;

class Parent {
        int x = 0;
        public void printX() {
                System.out.println(x);
        }
}

public class Child1 extends Parent {
        int x = -1;
        public static void main(String... args) {
                new Child1().printX();

        }
}
