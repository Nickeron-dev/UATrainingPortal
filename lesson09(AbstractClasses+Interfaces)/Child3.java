package classes;

class Parent3 {
        static int a;
}

public class Child3 extends Parent3 {
        public static void main(String... args) {
                Child3.a = 10;
                Parent3.a = 5;
                System.out.println(Child3.a);
        }
}
