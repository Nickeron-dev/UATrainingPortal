package classes;

public class DoesNotOverride extends Job {
        public String getName() {
                /* name of this method was changed in
                 superclass(since there is no @Override it doesn't tell about error) */
                return "Smth";
        }

        public static void main(String... args) {
                DoesNotOverride d = new DoesNotOverride();
                System.out.println(d.getName());
        }
}
