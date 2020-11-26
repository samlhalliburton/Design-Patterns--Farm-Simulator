package test.java;

import main.java.Decorator.Crop;
import org.junit.Assert;
import org.junit.Test;

public class CropTest {
    @Test
    public void testNotReadyForHarvest() {
        Crop corn = new Crop("Corn");
        corn.addDay();
        Assert.assertEquals(corn.harvestCrop(), "The crop Corn is not ready to be harvested.");
    }

    @Test
    public void testNotReadyForHarvest2 () {
        Crop corn = new Crop("Corn");
        corn.addDay();
        corn.addDay();
        corn.addDay();
        Assert.assertEquals(corn.harvestCrop(), "The crop Corn is not ready to be harvested.");
    }

    @Test
    public void testReadyForHarvest () {
        Crop corn = new Crop("Corn");
        corn.addDay();
        corn.addDay();
        Assert.assertEquals(corn.harvestCrop(), "The crop Corn can be harvested now.");
    }

    @Test
    public void testHarvestTime() {
        Crop corn = new Crop("Corn");
        Assert.assertEquals(corn.harvestTime, 1);
    }
}
