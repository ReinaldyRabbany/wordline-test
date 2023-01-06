package com.worldline.interview;

public abstract class Engine {
    protected boolean running;
    protected int fuelLevel;
    protected FuelType requiredFuelType;
    protected FuelType fuelType;
    protected int batchSize;

    public abstract void start();
    public abstract void stop();
    public abstract boolean isRunning();
    public abstract void fill(FuelType fuelType, int fuelLevel);
    public abstract FuelType getFuelType();
    public abstract int getBatchSize();
}
