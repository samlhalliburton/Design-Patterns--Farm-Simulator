package main.java.Decorator;

import main.java.Factory.FarmFactory;

public class Crop {
    public String name;
    public int harvestTime;
    public FarmFactory farmFactory;

    /**
     * Crop constructor method.
     * @param name Crop name
     * @param farmFactory farmFactory
     */
    public Crop(String name, FarmFactory farmFactory) {
        this.name = name;
        this.farmFactory = farmFactory;
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