package test.java;

import main.java.Factory.AnimalFarmFactory;
import main.java.Factory.CropFarmFactory;
import main.java.Factory.FarmFactory;
import main.java.Factory.HybridFarmFactory;
import org.junit.Assert;
import org.junit.Test;

public class FarmFactoryTest {
    private static FarmFactory farmFactory;

    static void configureFarm(String farmType) {
        if (farmType.equals("Animal")) {
            farmFactory = new AnimalFarmFactory();
        } else if (farmType.equals("Crop")) {
            farmFactory = new CropFarmFactory();
        } else {
            farmFactory = new HybridFarmFactory();
        }
    }

    static void runFarm() {
        farmFactory.constructFarm();
        farmFactory.printCurrentDay();
    }

    @Test
    public void testGetTotalCurrency() {
        configureFarm("Animal");
        runFarm();
        farmFactory.setTotalCurrency(100);
        Assert.assertEquals(farmFactory.getTotalCurrency(), 100);
        Assert.assertNotEquals(farmFactory.getTotalCurrency(), 0);
    }

    @Test
    public void testAnimalFactory() {
        configureFarm("Animal");
        runFarm();
        String test = String.valueOf(farmFactory.createNewFarm());
        Assert.assertNotEquals(test, "An animal farm was created.");
    }

    @Test
    public void testCropFactory () {
        configureFarm("Crop");
        runFarm();
        Assert.assertNotEquals(farmFactory.createNewFarm(), "A crop farm was created.");
    }

    @Test
    public void testHybridFactory() {
        configureFarm("Hybrid");
        runFarm();
        Assert.assertNotEquals(farmFactory.createNewFarm(), "A hybrid farm was created.");
    }
}
