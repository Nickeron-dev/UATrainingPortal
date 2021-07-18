package classes;

public class StudentFinally {
        private static int age;
        public static void setAge(int age) {
                try {
                        if (age <= 0) {
                                throw new RuntimeException("impossible");
                        }
                        StudentFinally.age = age;
                } finally {
                        System.out.println("resource cleanup" + age);
                }
                System.out.println("End of method" + age);
        }

        public static int getAgeWoman() {
                try {
                        return age - 3; // it will be overriden by return in finally
                } finally {
                        return age;
                }
        }

        public static void main(String... args) {
                try {
                        setAge(23);
                        setAge(-5);
                } catch (RuntimeException exc) {
                        exc.printStackTrace();
                }
                System.out.println(getAgeWoman());
        }
}
