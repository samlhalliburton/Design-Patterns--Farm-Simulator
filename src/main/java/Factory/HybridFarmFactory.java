/**
 * HybridFarmFactory.java
 *
 * Hybrid Farm Factory abstract class for creation of all hybrid farms and their methods.
 *
 * @author Samantha Halliburton
 * @version 1.0.0
 */

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
