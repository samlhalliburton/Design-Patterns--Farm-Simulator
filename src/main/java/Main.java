/**
 * Main.java
 *
 * Main class for running the farm simulation via the main method.
 *
 * @author Samantha Halliburton
 * @version 1.0.0
 */

package main.java;

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
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.println("Hello World!");
//    System.out.println("Enter a number to test:");
//    int input = scanner.nextInt();
//
//    setValueGreaterThanZero(input);
//    System.out.println("Is input greater than zero? " + output);

    //Testing Farm Factory (Factory Design Pattern) by creating Animal Farm
    configureFarm("Animal");
    runFarm();
    farmFactory.nextNight();
    farmFactory.nextNight();
    farmFactory.nextDay();
    farmFactory.nextDay();
    System.out.println(farmFactory.getTotalCycles());
    System.out.println();

    //Testing Farm Factory (Factory Design Pattern) by creating Crop Farm
    configureFarm("Crop");
    runFarm();
    System.out.println();

    //Testing Farm Factory (Factory Design Pattern) by creating Hybrid Farm
    configureFarm("Hybrid");
    runFarm();
    System.out.println(farmFactory.getTotalCycles());
    System.out.println();
  }

}
