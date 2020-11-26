package main.java.Facade;

public class AnimalProduct {
    public String name;
    public int harvestTime;

    /**
     * AnimalProduct constructor method.
     * @param name Animal Product name
     */
    public AnimalProduct(String name) {
        this.name = name;
        this.harvestTime = 1;
    }

    /**
     * harvestAnimalProduct()
     * Checks whether an animal product is ready to harvest.
     * @return String statement
     */
    public String harvestAnimalProduct() {
        if (harvestTime % 1 == 0) {
            harvestTime = 0;
            return "The crop " + name + " can be harvested now.";
        } else {
            return "The crop " + name + " is not ready to be harvested.";
        }
    }

    /**
     * addDay()
     * Counts number of days animal product has existed.
     * @return int harvestTime
     */
    public int addDay() {
        harvestTime += 1;
        return harvestTime;
    }
}
