package classes;

public class Overrides extends Job {
        @Override
        public String getName() {
                /* name of this method was changed in
                 superclass(so compiler can't find this method in Job.java so it says about error) */
                return "Name";
        }

        public static void main(String... args) {
                Overrides over = new Overrides();
                System.out.println(over.getName());
        }
}
