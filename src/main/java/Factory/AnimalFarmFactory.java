/**
 * AnimalFarmFactory.java
 *
 * Animal Farm Factory abstract class for creation of all animal farms and their methods.
 *
 * @author Samantha Halliburton
 * @version 1.0.0
 */

package main.java.Factory;

/*
 * Animal Farm Factory will produce Animal Farms.
 */
public class AnimalFarmFactory extends FarmFactory {

  @Override
  public Farm createNewFarm() {

    AnimalFarm animalFarm = new AnimalFarm();
    return animalFarm;

  }

}
