package main.java.Factory;

public abstract class FarmFactory {

  public void constructFarm() {

    Farm newFarm = createNewFarm();

  }

  public abstract Farm createNewFarm();

}
