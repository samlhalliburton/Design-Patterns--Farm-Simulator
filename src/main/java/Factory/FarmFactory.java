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
    days += 1;
    System.out.println("Day " + days + ": It is now daytime.");
  }

  public void nextNight() {
    nights += 1;
    System.out.println("Night " + nights + ": It is now nighttime.");
  }

  public void setTotalCycles() {
    this.totalCycles = 0;
  }

  public void getTotalCycles() {
    if(nights == days) {
      totalCycles = nights;
    } else if (nights != days) {
      totalCycles = days;
    }
  }

}
