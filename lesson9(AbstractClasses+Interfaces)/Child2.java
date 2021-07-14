package classes;

class Parent2 {
        static int a = 2;
}

public class Child2 extends Parent2 {
        static int a = 3;

        public static void main(String... args) {
                Child2 c = new Child2();
                System.out.println(c.a); // will be 3 since a is static and it is pinned to Child2
                Parent2 p = c;
                System.out.println(p.a); // will be 2 since a is static and it is pinned to Parent2
                // depends on the variable type
                System.out.println(Child2.a);
                System.out.println(Parent2.a);
        }
}
