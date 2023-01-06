package com.worldline.interview;

public enum FuelType {
    PETROL(9), 
    DIESEL(12), 
    WOOD(4.35f), 
    COAL(5.65f);

    private float costPerBatch;
    
    FuelType(float costPerBatch) {
        this.costPerBatch = costPerBatch;
    }

    public float getCostPerBatch() {
        return costPerBatch;
    }
}
