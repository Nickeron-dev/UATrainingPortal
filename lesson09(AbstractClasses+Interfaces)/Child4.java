package classes;

class Parent4 {
        public int getValue() {
                return 0;
        }

        public void print() {
                System.out.println(getValue());
        }
}

public class Child4 extends Parent4 {
        public int getValue() {
                return 1;
        }

        public static void main(String... args) {
                Child4 c = new Child4();
                System.out.println(c.getValue());
                Parent4 p = c;
                System.out.println(p.getValue());
                Parent4 parent4 = new Child4();
                parent4.print();
                Parent4 parent44 = new Parent4();
                parent44.print();
        }
}
