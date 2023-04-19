package com.epam.course.greenhouse;

public interface GreenHouseWork {
    void buyPlant(String name, String type, String region, int price);
    void removePlant(String name, String type);
    void waterPlant(boolean waterPlant);
    void changeTemperature(double temperature);
    void createPlantInfo(String name, String type, String region, int price,
                         boolean waterPlant, double temperature);
    void updatePlantInfo(String name, String type, String region, int price,
                         boolean waterPlant, double temperature);
}
