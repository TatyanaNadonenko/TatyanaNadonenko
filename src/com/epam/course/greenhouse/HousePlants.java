package com.epam.course.greenhouse;

public class HousePlants extends GreenHouseInfo {
    public HousePlants(String name, String type, String region, int price,
                       boolean waterPlant, double temperature) {
        super(name, type, region, price, waterPlant, temperature);
    }

    @Override
    void spray() {
//        System.out.println(super.name + " is sprayed");
    }

    @Override
    void cut() {
//        System.out.println("In house plants, only dry leaves should be cut.");

    }


    void transplant() {
        System.out.println("Don't transplant this plant - " + super.name);

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
