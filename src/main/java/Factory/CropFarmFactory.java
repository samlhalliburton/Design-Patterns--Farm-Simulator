package main.java.Factory;

public class CropFarmFactory extends FarmFactory {

  @Override
  public Farm createNewFarm() {

    return new CropFarm();

  }

}
