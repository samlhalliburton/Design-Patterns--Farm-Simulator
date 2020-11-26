package main.java.Decorator;

public class Crop {
    public String name;
    public int harvestTime;

    /**
     * Crop constructor method.
     * @param name Crop name
     */
    public Crop(String name) {
        this.name = name;
        this.harvestTime = 1;
    }

    /**
     * harvestCrop()
     * Checks whether a crop is ready to harvest.
     * @return String statement
     */
    public String harvestCrop() {
        if (harvestTime % 2 == 0) {
            harvestTime = 0;
            return "The crop " + name + " can be harvested now.";
        } else {
            return "The crop " + name + " is not ready to be harvested.";
        }
    }

    /**
     * addDay()
     * Counts number of days crop has existed.
     * @return int harvestTime
     */
    public int addDay() {
        harvestTime += 1;
        return harvestTime;
    }
}