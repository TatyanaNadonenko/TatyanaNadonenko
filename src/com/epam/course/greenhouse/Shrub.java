package com.epam.course.greenhouse;

public class Shrub extends GreenHouseInfo {
    public Shrub(String name, String type, String region, int price, boolean waterPlant,
                 double temperature) {
        super(name, type, region, price, waterPlant, temperature);
    }

    @Override
    void spray() {
        System.out.println(super.name + " is sprayed.");
    }

    void cut() {
        System.out.println(super.name + "is trimmed.");
    }


    void transplant() {
//        System.out.println("All shrubs must be transplant except " + super.name);

    }
    @Override
    public void getInfoByType(String type) {
        System.out.println("Type of " + super.name + " is: " + super.type);


    }

    @Override
    public void getInfoByRegion(String region) {
        System.out.println("Native region of " + super.name + " is " + super.region);
    }
}
