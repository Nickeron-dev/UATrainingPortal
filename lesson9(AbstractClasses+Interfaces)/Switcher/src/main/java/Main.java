import entity.IElectricityConsumer;
import entity.Lamp;
import entity.Switcher;

/**
 * @author Illia Koshkin
 */
public class Main {

    public static void main(String... args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();

        // event subscribe
        switcher.setConsumer(lamp);
        class Fire implements IElectricityConsumer { // local class

            @Override
            public void electricityOn() {
                System.out.println("Fire!");
            }

        }
        switcher.setConsumer(new Fire());
        switcher.setConsumer(
                new IElectricityConsumer() {    // this is anonymous class
                    @Override
                    public void electricityOn() {
                        System.out.println("Anonymous came!");
                    }
                }
        );
        switcher.setConsumer(() -> System.out.println("Lambda is here!")); // this is lambda
        /*
        () in lambda can be skipped if there is only 1 parameter(we have 0 so we can't skip 'em)
         */

        switcher.electricityOn();

    }

}
