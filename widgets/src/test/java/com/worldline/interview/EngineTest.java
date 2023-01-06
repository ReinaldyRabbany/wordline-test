package test.java.com.worldline.interview;

import org.junit.Assert;
import org.junit.Test;

import com.worldline.interview.Engine;
import com.worldline.interview.FuelType;
import com.worldline.interview.SteamEngine;

public class EngineTest {
    
    Engine engine = new SteamEngine(FuelType.WOOD);

    @Test(expected = IllegalStateException.class)
    public void start_fail_test() {
        engine.start();
        
        Assert.assertFalse(engine.isRunning());
    }

    @Test
    public void start_success_test() {
        engine.fill(FuelType.WOOD, 10);
        engine.start();

        Assert.assertTrue(engine.isRunning());
    }

    @Test
    public void stop_test() {
        engine.fill(FuelType.WOOD, 10);
        engine.start();

        engine.stop();
        
        Assert.assertFalse(engine.isRunning());
    }
}
