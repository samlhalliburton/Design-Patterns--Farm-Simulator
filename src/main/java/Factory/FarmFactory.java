package main.java.Factory;

/*
 * Base factory class for farms.
 */
public abstract class FarmFactory {

  public void constructFarm() {

    Farm newFarm = createNewFarm();
    newFarm.createFarm();

  }

  public abstract Farm createNewFarm();

}
