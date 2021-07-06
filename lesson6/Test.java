package classes;

public class Test {

        public Test() {

        }

        public Test(int x, double y) {

        }

        public Test(double y, int x) {
                return;
        }

        int getX() {
                return x;
        }

        int y = getX();
        int x = 3;
        public static void main(String... args) {
                Test test = new Test();
                System.out.println(test.y);
                C c = new C();
        }

        void get(int x, double y) {

        }

        void get(double y, int x) {

        }
}

class A {
        A() {
                System.out.println("Inside A");
        }
}

class B extends A{
        B() {
                System.out.println("Inside B");
        }
}

class C extends B{
        C() {
                System.out.println("Inside C");
        }
}
