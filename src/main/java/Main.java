/**
 * Main.java
 * Main class for running the farm simulation via the main method.
 *
 * @author Samantha Halliburton
 * @version 1.0.0
 */

package main.java;

import main.java.Decorator.Animal;
import main.java.Decorator.AnimalImpl;
import main.java.Decorator.AnimalProduction;
import main.java.Decorator.AnimalSize;
import main.java.Decorator.AnimalSpeed;
import main.java.Decorator.Crop;
import main.java.Decorator.Farmer;
import main.java.Decorator.FarmerGrowing;
import main.java.Decorator.FarmerImpl;
import main.java.Decorator.FarmerMoney;
import main.java.Decorator.FarmerRearing;
import main.java.Facade.Predator;
import main.java.Factory.AnimalFarmFactory;
import main.java.Factory.CropFarmFactory;
import main.java.Factory.FarmFactory;
import main.java.Factory.HybridFarmFactory;

public class Main {
    private static FarmFactory farmFactory;

    static void configureFarm(String farmType) {
        if (farmType.equals("Animal")) {
            farmFactory = new AnimalFarmFactory();
        } else if (farmType.equals("Crop")) {
            farmFactory = new CropFarmFactory();
        } else {
            farmFactory = new HybridFarmFactory();
        }
    }

    static void runFarm() {
        farmFactory.constructFarm();
        farmFactory.printCurrentDay();
    }

    /**
     * Main method.
     * @param args arguments
     */
    public static void main(String[] args) {
        //Testing Farm Factory (Factory Design Pattern) by creating Animal Farm
        configureFarm("Animal");
        runFarm();
        farmFactory.nextNight();
        farmFactory.nextDay();
        farmFactory.nextNight();

        //Testing full day counts: should output 2
        System.out.println("Total number of full days: " + farmFactory.getTotalCycles());

        //Testing Wolf Predator attack() - only during nighttime
        Predator wolf = new Predator("Wolf", true, false, farmFactory);
        System.out.println(wolf.attack());

        //Testing Wolf Predator eat()
        System.out.println(wolf.eat());

        //Testing Rabbit Predator eat() - only during nighttime
        Predator rabbit = new Predator("Rabbit", false, true, farmFactory);
        System.out.println(rabbit.eat());

        farmFactory.nextDay();
        farmFactory.nextNight();

        //Testing Mole Predator damage() - only during nighttime
        Predator mole = new Predator("Mole", false, false, farmFactory);
        System.out.println(mole.damage());
        System.out.println("Total number of full days: " + farmFactory.getTotalCycles()); // output should be 3
        System.out.println();

        //Testing Farm Factory (Factory Design Pattern) by creating Crop Farm
        configureFarm("Crop");
        runFarm();
        System.out.println();

        //Testing Farm Factory (Factory Design Pattern) by creating Hybrid Farm
        configureFarm("Hybrid");
        runFarm();

        //Testing crop
        Crop corn = new Crop("Corn", farmFactory);
        farmFactory.nextNight();
        corn.addDay();
        farmFactory.nextDay();
        farmFactory.nextNight();
        corn.addDay();
        System.out.println(corn.harvestCrop());
        farmFactory.nextDay();
        farmFactory.nextNight();
        corn.addDay();
        System.out.println(corn.harvestCrop());

        //Testing full day counts: should output 3
        System.out.println("Total number of full days: " + farmFactory.getTotalCycles());
        System.out.println();

        //Testing Decorator Pattern with Farmer Rearing Affinity
        Farmer farmer1 = new FarmerRearing(new FarmerImpl());
        System.out.println(farmer1.decorate());

        //Testing Decorator Pattern with Farmer Growing Affinity
        Farmer farmer2 = new FarmerGrowing(new FarmerImpl());
        System.out.println(farmer2.decorate());

        //Testing Decorator Pattern with Farmer Money-Making Affinity
        Farmer farmer3 = new FarmerMoney(new FarmerImpl());
        System.out.println(farmer3.decorate());
        System.out.println();

        //Testing Decorator Pattern with Animal Production Affinity
        Animal cow = new AnimalProduction(new AnimalImpl());
        System.out.println(cow.decorate());
        farmFactory.productionCurrency(cow);
        System.out.println("The farm has gained $" + farmFactory.getTotalCurrency());

        //Testing Decorator Pattern with Animal Speed Affinity
        Animal horse = new AnimalSpeed(new AnimalImpl());
        System.out.println(horse.decorate());
        farmFactory.speedCurrency(horse);
        System.out.println("The farm has gained $" + farmFactory.getTotalCurrency());

        //Testing Decorator Pattern with Animal Size Affinity
        Animal sheep = new AnimalSize(new AnimalImpl());
        System.out.println(sheep.decorate());
        farmFactory.sizeCurrency(sheep);
        System.out.println("The farm has gained $" + farmFactory.getTotalCurrency());
        System.out.println();
    }

}
