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
            for (int i = 0; i < consumers.size(); i++) {
                consumers.get(i).electricityOn();
            }

        }
    }

    public void setConsumer(IElectricityConsumer consumer) {
        this.consumers.add(consumer);
    }
}
