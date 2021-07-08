package classes;

public class Child2 extends Base2 {
        int x = 20;

        Child2() {
                System.out.println("Child constructor");
                show();
        }

        void show() {
                System.out.println("Child Show " + x + " ");
        }

        public static void main(String... args) {
                new Child2();
        }
}

class Base2 {

        int x = 10;

        Base2() {
                System.out.println("Base constructor");
                show();
        }

        void show() {
                System.out.println("Base Show " + x + " ");
        }

}
