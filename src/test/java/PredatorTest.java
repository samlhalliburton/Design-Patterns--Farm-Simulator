package test.java;

import main.java.Facade.Predator;
import main.java.Factory.FarmFactory;
import org.junit.Assert;
import org.junit.Test;

public class PredatorTest {
    FarmFactory farmFactory;

    @Test
    public void testAttack() {
        farmFactory.nextNight();
        Predator wolf = new Predator("Wolf", true, false, farmFactory);
        Assert.assertNotEquals(wolf.attack(), "A Wolf has attacked!");
    }

    @Test
    public void testEatMeat() {
        Predator wolf = new Predator("Wolf", true, false, farmFactory);
        Assert.assertNotEquals(wolf.eat(), "A Wolf has eaten a farm animal!");
    }

    @Test
    public void testEatPlant() {
        Predator rabbit = new Predator("Rabbit", false, true, farmFactory);
        Assert.assertNotEquals(rabbit.eat(), "A Rabbit has eaten crops!");
    }

    @Test
    public void testDamage() {
        Predator mole = new Predator("Mole", false, false, farmFactory);
        Assert.assertNotEquals(mole.damage(), "A Mole has damaged the soil!");
    }
}
