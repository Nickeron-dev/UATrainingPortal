package classes;

class Parent5 {
        static public int getValue() {
                return 0;
        }
}

public class Child5 extends Parent5 {
        static public int getValue() {
                return 1;
        }

        static public void main(String... args) {
                Child5 c = new Child5();
                System.out.println(c.getValue());
                Parent5 p = c;
                System.out.println(p.getValue());
        }
}
