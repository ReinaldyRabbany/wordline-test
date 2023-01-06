package com.worldline.interview;

// Test Taker: Reinaldy Rabbany
public class WidgetMachine {
    private Engine engine;

    public WidgetMachine(Engine engine) {
        this.engine = engine;
    }

    public float produceWidgets(int quantity) {
        engine.start();
        float cost = 0;

        if (engine.isRunning()) {
            cost = produce(quantity);
        }

        engine.stop();

        return cost;
    }

    private float produce(int quantity) {
        int batch = 0;
        int batchCount = 0;

        while (batch < quantity) {
            batch += engine.getBatchSize();
            batchCount++;
        }

        return batchCount * engine.getFuelType().getCostPerBatch();
    }
}
