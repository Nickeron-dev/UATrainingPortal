package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Illia Koshkin
 */
public class Switcher implements IElectricityConsumer {
    private List<IElectricityConsumer> consumers = new ArrayList<IElectricityConsumer>(10);

    @Override
    public void electricityOn() {
        System.out.println("Switcher is ON!");
        if (consumers != null) {
            consumers.stream().forEach((consumer) -> {
                consumer.electricityOn();
                System.out.println("Name of the class: " + consumer.getClass().getName()); // some reflection
            });
            // that was better than for loop
        }
    }

    public void setConsumer(IElectricityConsumer consumer) {
        this.consumers.add(consumer);
    }
}
