package main.java.Factory;

public class HybridFarmFactory extends FarmFactory{


  @Override
  public Farm createNewFarm() {

    return new HybridFarm();

  }

}
