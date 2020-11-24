package main.java.Factory;

/*
 * Animal Farm implementation.
 */
public class AnimalFarm implements Farm{
  int totalCycles = 0;
  int days = 1;
  int nights = 0;

  @Override
  public void createFarm() {
    System.out.println("An animal farm was created.");
    System.out.println("The current day is: Day " + days);
  }

  public void nextDay() {
    days += 1;
  }

  public void nextNight() {
    nights += 1;
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
