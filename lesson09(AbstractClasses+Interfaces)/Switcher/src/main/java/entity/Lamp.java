package entity;

/**
 * @author Illia Koshkin
 */
public class Lamp implements  IElectricityConsumer {

    @Override
    public void electricityOn() {
        System.out.println("Lamp is ON!");
    }

}
