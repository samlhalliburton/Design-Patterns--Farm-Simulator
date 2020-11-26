package test.java;

import main.java.Decorator.Farmer;
import main.java.Decorator.FarmerGrowing;
import main.java.Decorator.FarmerImpl;
import main.java.Decorator.FarmerMoney;
import main.java.Decorator.FarmerRearing;
import org.junit.Assert;
import org.junit.Test;

public class FarmerDecoratorTest {

    @Test
    public void testDecoratorRearing() {
        Farmer farmer = new FarmerRearing(new FarmerImpl());
        Assert.assertEquals(farmer.decorate(), "A farmer was created and has an affinity for rearing.");
    }

    @Test
    public void testDecoratorGrowing () {
        Farmer farmer = new FarmerGrowing(new FarmerImpl());
        Assert.assertEquals(farmer.decorate(), "A farmer was created and has an affinity for growing.");
    }

    @Test
    public void testDecoratorMoneyMaking() {
        Farmer farmer = new FarmerMoney(new FarmerImpl());
        Assert.assertEquals(farmer.decorate(), "A farmer was created and has an affinity for money-making.");
    }
}
