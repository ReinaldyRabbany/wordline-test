package com.worldline.interview;

public class SteamEngine extends Engine {
    
    public SteamEngine(FuelType requiredFuelType) {
        if (requiredFuelType != FuelType.WOOD 
                && requiredFuelType != FuelType.COAL) {
            throw new IllegalArgumentException("Fuel Type is not compitable.");
        }
        
        this.requiredFuelType = requiredFuelType;
        running = false;
        fuelLevel = 0;
        batchSize = 2;
    }

    @Override
    public void start() {
        if (fuelLevel > 0 && requiredFuelType.equals(fuelType)) {
            running = true;
        } else {
            throw new IllegalStateException("Not able to start engine.");
        }
    }

    @Override
    public void stop() {
        running = false;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    @Override
    public void fill(FuelType fuelType, int fuelLevel) {
        if (fuelType != requiredFuelType) {
            throw new IllegalArgumentException("Fuel Type is not compitable.");
        }
        
        if (fuelLevel >= 0 && fuelLevel <= 100) {
            this.fuelLevel = fuelLevel;
        }
        else if (fuelLevel > 100) {
            this.fuelLevel = 100;
        }
        else {
            this.fuelLevel = 0;
        }

        this.fuelType = fuelType;
    }

    @Override
    public FuelType getFuelType() {
        return requiredFuelType;
    }

    @Override
    public int getBatchSize() {
        return batchSize;
    }
}
