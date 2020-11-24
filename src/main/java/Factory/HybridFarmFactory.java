package main.java.Factory;

/*
 * Hybrid Farm Factory will produce Hybrid Farms.
 */
public class HybridFarmFactory extends FarmFactory{

  @Override
  public Farm createNewFarm() {

    return new HybridFarm();

  }

}
