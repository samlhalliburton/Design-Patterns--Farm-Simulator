/**
 * FarmFactory.java
 *
 * Farm Factory abstract class for creation of all farms and their methods.
 *
 * @author Samantha Halliburton
 * @version 1.0.0
 */

package main.java.Factory;

/*
 * Base factory class for farms.
 */
public abstract class FarmFactory {

  int totalCycles = 0;
  int days = 1;
  int nights = 0;

  public void constructFarm() {

    Farm newFarm = createNewFarm();
    newFarm.createFarm();
  }

  public abstract Farm createNewFarm();

  public void printCurrentDay() {
    System.out.println("The current day is: Day " + days);
  }

  public void nextDay() {
    if(nights == days) {
      days += 1;
      System.out.println("Day " + days + ": It is now daytime.");
    } else return;
  }

  public void nextNight() {
    if((days - nights) == 1) {
      nights += 1;
      System.out.println("Night " + nights + ": It is now nighttime.");
    } else if ((days - nights) != 1) return;
  }

  public void setTotalCycles() {
    this.totalCycles = 0;
  }

  public int getTotalCycles() {
    if(nights == days) {
      totalCycles = nights;
    } else if (nights != days) {
      totalCycles = days;
    }

    return totalCycles;
  }

}
