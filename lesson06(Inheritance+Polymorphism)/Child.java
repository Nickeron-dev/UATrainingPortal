package classes;

public class Child extends Base {
        Child() {
                System.out.println("Child constructor");
                show();
        }
        void show() {
                System.out.println("Child Show" + x + " ");
        }
        public static void main(String[] args) {
                new Child();
        }
}

class Base {
        int x = 10;
        Base() {
                System.out.println("Base constructor");
                show();
        }
        void show() {
                System.out.println("Base show" + x + " ");
        }
}
