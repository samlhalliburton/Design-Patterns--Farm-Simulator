/**
 * Main.java
 *
 * Main class for running the farm simulation via the main method.
 *
 * @author Samantha Halliburton
 * @version 1.0.0
 */

package main.java;

import main.java.Decorator.*;
import main.java.Factory.AnimalFarmFactory;
import main.java.Factory.CropFarmFactory;
import main.java.Factory.FarmFactory;
import main.java.Factory.HybridFarmFactory;

public class Main {
  private static FarmFactory farmFactory;
  static boolean output;
  String farmType;

  static void setValueGreaterThanZero(int x) {
    if(x > 0) {
      output = true;
    } else if(x <= 0) {
      output = false;
    } else if(x == 0) {
      output = false;
    }
  }

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

  public static void main(String[] args) {
    //Testing Farm Factory (Factory Design Pattern) by creating Animal Farm
    configureFarm("Animal");
    runFarm();
    farmFactory.nextNight();
    farmFactory.nextDay();
    System.out.println("Total number of full days: " + farmFactory.getTotalCycles());
    System.out.println();

    //Testing Farm Factory (Factory Design Pattern) by creating Crop Farm
    configureFarm("Crop");
    runFarm();
    System.out.println();

    //Testing Farm Factory (Factory Design Pattern) by creating Hybrid Farm
    configureFarm("Hybrid");
    runFarm();
    farmFactory.nextNight();
    farmFactory.nextDay();
    farmFactory.nextNight();
    System.out.println("Total number of full days: " + farmFactory.getTotalCycles());
    System.out.println();

    //Testing Decorator Pattern with Farmer Rearing Affinity
    Farmer farmer1 = new FarmerRearing(new FarmerImpl());
    System.out.println(farmer1.decorate());
    //System.out.println();

    //Testing Decorator Pattern with Farmer Growing Affinity
    Farmer farmer2 = new FarmerGrowing(new FarmerImpl());
    System.out.println(farmer2.decorate());
    //System.out.println();

    //Testing Decorator Pattern with Farmer Money-Making Affinity
    Farmer farmer3 = new FarmerMoney(new FarmerImpl());
    System.out.println(farmer3.decorate());
    System.out.println();

    //Testing Decorator Pattern with Animal Production Affinity
    Animal cow = new AnimalProduction(new AnimalImpl());
    System.out.println(cow.decorate());
    //System.out.println();

    //Testing Decorator Pattern with Animal Speed Affinity
    Animal horse = new AnimalSpeed(new AnimalImpl());
    System.out.println(horse.decorate());
    //System.out.println();

    //Testing Decorator Pattern with Animal Size Affinity
    Animal sheep = new AnimalSize(new AnimalImpl());
    System.out.println(sheep.decorate());
    System.out.println();
  }

}
