/**
 * FarmFactory.java
 * <p>
 * Farm Factory abstract class for creation of all farms and their methods.
 *
 * @author Samantha Halliburton
 * @version 1.0.0
 */

package main.java.Factory;

/**
 * Base factory class for farms.
 */
public abstract class FarmFactory {

    int totalCycles = 0;
    int days = 1;
    int nights = 0;
    boolean night = false;
    int totalCurrency = 0;

    /**
     * constructFarm()
     * Creates a farm.
     */
    public void constructFarm() {

        Farm newFarm = createNewFarm();
        newFarm.createFarm();
    }

    public abstract Farm createNewFarm();

    /**
     * printCurrentDay()
     * Prints out the current day.
     */
    public void printCurrentDay() {
        System.out.println("The current day is: Day " + days);
    }

    /**
     * nextDay()
     * Sets the next day.
     */
    public void nextDay() {
        if (nights == days) {
            days += 1;
            night = false;
            System.out.println("Day " + days + ": It is now daytime.");
        } else {
            return;
        }
    }

    /**
     * nextNight()
     * Sets the next night.
     */
    public void nextNight() {
        if ((days - nights) == 1) {
            nights += 1;
            night = true;
            System.out.println("Night " + nights + ": It is now nighttime.");
        } else if ((days - nights) != 1) {
            return;
        }
    }

    /**
     * getTotalCycles()
     * Returns the total number of completed days (both daytime and nighttime have occurred).
     * @return int totalCycles
     */
    public int getTotalCycles() {
        if (nights == days) {
            totalCycles = nights;
        } else if (nights != days) {
            totalCycles = days;
        }

        return totalCycles;
    }

    /**
     * getNight()
     * Returns the night boolean.
     * @return boolean night
     */
    public boolean getNight() {
        return night;
    }

}
