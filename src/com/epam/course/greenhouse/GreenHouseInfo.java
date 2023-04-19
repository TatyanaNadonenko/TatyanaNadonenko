package com.epam.course.greenhouse;

public abstract class GreenHouseInfo implements GreenHouse{
    protected String name;
    protected String type;
    protected String region;
    protected int price;
    protected boolean waterPlant;
    protected double temperature;

    public GreenHouseInfo() {

    }

    public GreenHouseInfo(String name, String type, String region, int price,
                          boolean waterPlant, double temperature) {
        this.name = name;
        this.type = type;
        this.region = region;
        this.price = price;
        this.waterPlant = waterPlant;
        this.temperature = temperature;
    }
    abstract void spray();
    abstract void cut();
    abstract void transplant();

    int getPrice() {
        return price;
    }
    double getTemperature() {
        return temperature;
    }

}
