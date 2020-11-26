package main.java.Facade;

import main.java.Factory.FarmFactory;

public class Predator {
    public String name;
    public boolean meatEater = false;
    public boolean plantEater = false;
    public FarmFactory farmFactory;

    /**
     * Predator constructor.
     * @param name String
     * @param meatEater boolean
     * @param plantEater boolean
     * @param farmFactory FarmFactory
     */
    public Predator(String name, boolean meatEater, boolean plantEater, FarmFactory farmFactory) {
        this.name = name;
        this.meatEater = meatEater;
        this.plantEater = plantEater;
        this.farmFactory = farmFactory;
    }

    /**
     * attack()
     * Predator attacks.
     * @return String
     */
    public String attack() {
        if(farmFactory.getNight() == true && meatEater == true) {
            return "A " + name + " has attacked!";
        }
        return null;
    }

    /**
     * eat()
     * Predator eats.
     * @return String
     */
    public String eat() {
        if(farmFactory.getNight() == true && meatEater == true && plantEater == false) {
            return "A " + name + " has eaten a farm animal!";
        } else if (farmFactory.getNight() == true && meatEater == false && plantEater == true) {
            return "A " + name + " has eaten crops!";
        }
        return null;
    }

    /**
     * damage()
     * Predator damages.
     * @return String
     */
    public String damage() {
        if(farmFactory.getNight() == true && meatEater == false && plantEater == true) {
            return "A " + name + " has damaged the soil!";
        } else if (farmFactory.getNight() == true && meatEater == false && plantEater == false) {
            return "A " + name + " has damaged the soil!";
        }
        return null;
    }
}
