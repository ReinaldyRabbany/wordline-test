package test.java.com.worldline.interview;

import org.junit.Assert;
import org.junit.Test;

import com.worldline.interview.*;

public class WidgetMachineTest {
    
    @Test
    public void produceWidget_steamEngine_wood_test() {
        Engine engine = new SteamEngine(FuelType.WOOD);
        WidgetMachine widgetMachine = new WidgetMachine(engine);

        engine.fill(FuelType.WOOD, 100);
        int quantity = 10;
        float result = widgetMachine.produceWidgets(quantity);

        Assert.assertEquals(21.75f, result, 0);
    }

    @Test
    public void produceWidget_steamEngine_coal_test() {
        Engine engine = new SteamEngine(FuelType.COAL);
        WidgetMachine widgetMachine = new WidgetMachine(engine);

        engine.fill(FuelType.COAL, 100);
        int quantity = 10;
        float result = widgetMachine.produceWidgets(quantity);

        Assert.assertEquals(28.25f, result, 0);
    }
}
