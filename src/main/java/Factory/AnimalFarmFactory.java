package main.java.Factory;

/*
 * Animal Farm Factory will produce Animal Farms.
 */
public class AnimalFarmFactory extends FarmFactory {

  int totalCycles = 0;
  int days = 1;
  int nights = 0;

  @Override
  public Farm createNewFarm() {

    AnimalFarm animalFarm = new AnimalFarm();
    return animalFarm;

  }

}
