package main.java.Decorator;

import main.java.Factory.FarmFactory;

public class Crop {
    public String name;
    public int harvestTime;
    public FarmFactory farmFactory;

    public Crop(String name, FarmFactory farmFactory) {
        this.name = name;
        this.farmFactory = farmFactory;
        this.harvestTime = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHarvestTime() {
        return harvestTime;
    }

    public void setHarvestTime(int harvestTime) {
        this.harvestTime = harvestTime;
    }

    public int harvest() {
       harvestCrop();
       return harvestTime;
    }

    public String harvestCrop() {
        if(harvestTime % 2 == 0) {
            harvestTime = 0;
            return "The crop " + name + " can be harvested now.";
        }
        else {
            return "The crop " + name + " is not ready to be harvested.";
        }
    }

    public int addDay() {
        harvestTime += 1;
        return harvestTime;
    }
}
