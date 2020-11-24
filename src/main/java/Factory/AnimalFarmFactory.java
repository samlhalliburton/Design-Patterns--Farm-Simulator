package main.java.Factory;

/*
 * Animal Farm Factory will produce Animal Farms.
 */
public class AnimalFarmFactory extends FarmFactory {

  @Override
  public Farm createNewFarm() {

    return new AnimalFarm();

  }

}
