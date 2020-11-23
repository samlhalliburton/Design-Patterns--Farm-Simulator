package main.java.Factory;

public class AnimalFarmFactory extends FarmFactory {

  @Override
  public Farm createNewFarm() {

    return new AnimalFarm();
    
  }

}
