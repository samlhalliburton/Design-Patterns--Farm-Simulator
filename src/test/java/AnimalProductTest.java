package test.java;

import main.java.Facade.AnimalProduct;
import org.junit.Assert;
import org.junit.Test;

public class AnimalProductTest {

    @Test
    public void testWoolNotReadyForHarvest() {
        AnimalProduct wool = new AnimalProduct("Wool");
        Assert.assertEquals(wool.harvestAnimalProduct(), "The animal product Wool is not ready to be harvested.");
    }

    @Test
    public void testWoolNotReadyForHarvest2 () {
        AnimalProduct wool = new AnimalProduct("Wool");
        wool.addDay();
        wool.addDay();
        Assert.assertEquals(wool.harvestAnimalProduct(), "The animal product Wool is not ready to be harvested.");
    }

    @Test
    public void testWoolReadyForHarvest () {
        AnimalProduct wool = new AnimalProduct("Wool");
        wool.addDay();
        Assert.assertEquals(wool.harvestAnimalProduct(), "The animal product Wool can be harvested now.");
    }

    @Test
    public void testWoolHarvestTime() {
        AnimalProduct wool = new AnimalProduct("Wool");
        Assert.assertEquals(wool.harvestTime, 1);
    }
}
