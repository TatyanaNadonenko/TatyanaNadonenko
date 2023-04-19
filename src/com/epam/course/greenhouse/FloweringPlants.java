package com.epam.course.greenhouse;

public class FloweringPlants extends GreenHouseInfo {
    public FloweringPlants(String name, String type, String region, int price,
                           boolean waterPlant, double temperature) {
        super(name, type, region, price, waterPlant, temperature);
    }

    @Override
    void spray() {
        System.out.println("Don' spray this plant: " + super.name);

    }


    void cut() {
//        System.out.println("Cat " + super.name + " wary carefully!");

    }


    void transplant() {
        System.out.println(super.name + " Flowering plant is transplanted");

    }


    @Override
    public void getInfoByType(String type) {
        System.out.println("Type of " + super.name + " is: ");

    }

    @Override
    public void getInfoByRegion(String region) {
        System.out.println("Native region of " + super.name + " is " + super.region);

    }
}
