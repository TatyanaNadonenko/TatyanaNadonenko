package com.epam.course.greenhouse;
/**
 * Task: Create new project using interfaces.
 *
 *  * @author Tatyana Nadonenko
 *  * @version 1.0
 *  * @since 19-04-2023
 */

public class Program implements GreenHouseWork {
    public static void main(String[] args) {
        Program program = new Program();

        GreenHouseInfo[] plant = new GreenHouseInfo[7];
        plant[0] = new Shrub("Hydrangea", "shrub",
                "Europe", 540, true, 23.5);
        plant[1] = new Shrub("Physocarpus", "shrub","North America", 750,
                true, 23.5);

        plant[2] = new FloweringPlants("Rose", "Flowering plant",
                "Southeast Asia", 380, true, 22.5);
        plant[3] = new FloweringPlants("Carnation", "Flowering plant",
                "Indonesia", 790, true, 22.5);
        plant[4] = new FloweringPlants("Begonia", "Flowering plant",
                "South America", 250, true, 22.5);

        plant[5] = new HousePlants("Violets", "House Plants",
                "Africa",320, true, 20.5);
        plant[6] = new HousePlants("Dracaena", "House Plants",
                "Central America",320, true, 20.5);


        program.action(plant[0]);
        program.action(plant[3]);
        program.action(plant[1]);


        program.createPlantInfo("Dracaena", "House Plants", "Central America",
                320, true, 20.5);
        program.changeTemperature(21.5);
        program.removePlant("Begonia", "Flowering plant");
        program.buyPlant("Rhododendron", "Shrub", "Japan", 1500);
        program.waterPlant(true);


    }

    private void action(GreenHouseInfo greenHouseInfo) {
        greenHouseInfo.transplant();
        greenHouseInfo.spray();
        greenHouseInfo.cut();

    }

    @Override
    public void buyPlant(String name, String type, String region, int price) {
        System.out.println("\nBuy new plant in green house:\n" + "Name - " + name + "; type - "
                + type + "; native region - " + region + "; price - " + price);

    }

    @Override
    public void removePlant(String name, String type) {
        System.out.println("This plant is too old, please, remove it:\n" + name + " " + type);
    }

    @Override
    public void waterPlant(boolean waterPlant) {
        if (waterPlant == true) {
            System.out.println("All plants are watered.");
        } else {
            System.out.println("Flowers need to be watered");
        }
    }

    @Override
    public void changeTemperature(double temperature) {
        System.out.println("Please, change temperature to " + temperature);
    }

    @Override
    public void createPlantInfo(String name, String type, String region, int price,
                                boolean waterPlant, double temperature) {

        System.out.println("\nCreate new plant. \n" + "Name - " + name + "; type - " + type
                + "; native region - " + region + "; price - " + price + "; water plant - " + waterPlant
                + "; temperature - " + temperature);

    }


    @Override
    public void updatePlantInfo(String name, String type, String region, int price,
                                boolean waterPlant, double temperature) {
        System.out.println("Please, update information of this plant:\n" + "Name - " + name + "; type - " + type
                + "; native region - " + region + "; price - " + price + "; water plant - " + waterPlant
                + "; temperature - " + temperature);

    }

}
