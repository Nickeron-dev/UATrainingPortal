package classes;

interface A {
        int getValue(); // it has same signature as B
}

interface B {
        double getValue();
}

/*
class C implements A, B { // error
        int getValue() {
                return 1;
        }
} */

public class InterfacesConflict implements IntValue, DoubleValue {

        public static void main(String... args) {

                InterfacesConflict c = new InterfacesConflict();
                //System.out.println(c.value); // error
                System.out.println(((IntValue)c).value);
                System.out.println(((DoubleValue)c).value);
        }

}
