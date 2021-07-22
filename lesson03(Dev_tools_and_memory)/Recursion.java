public class Recursion {
        public static void main(String... args) {
                f(1);
                System.out.println("END");
        }

        private static void f(int k) {
                //System.out.println(k);
                if (k < 7) {
                        f(2 * k);
                }
                System.out.println(k);
        }
}
