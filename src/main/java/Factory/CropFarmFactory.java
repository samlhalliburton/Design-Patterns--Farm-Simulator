package main.java.Factory;

/*
 * Crop Farm Factory will produce Crop Farms.
 */
public class CropFarmFactory extends FarmFactory {

  @Override
  public Farm createNewFarm() {

    return new CropFarm();

  }

}
