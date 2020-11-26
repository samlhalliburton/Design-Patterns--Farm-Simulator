package test.java;

import main.java.Decorator.Animal;
import main.java.Decorator.AnimalImpl;
import main.java.Decorator.AnimalProduction;
import main.java.Decorator.AnimalSize;
import main.java.Decorator.AnimalSpeed;
import org.junit.Assert;
import org.junit.Test;

public class AnimalDecoratorTest {

    @Test
    public void testDecoratorProduction() {
        Animal animal = new AnimalProduction(new AnimalImpl());
        Assert.assertEquals(animal.decorate(),
                "An animal was created and has an affinity for production.");
    }

    @Test
    public void testDecoratorSpeed() {
        Animal animal = new AnimalSpeed(new AnimalImpl());
        Assert.assertEquals(animal.decorate(),
                "An animal was created and has an affinity for speed.");
    }

    @Test
    public void testDecoratorSize() {
        Animal animal = new AnimalSize(new AnimalImpl());
        Assert.assertEquals(animal.decorate(),
                "An animal was created and has an affinity for size.");
    }
}
