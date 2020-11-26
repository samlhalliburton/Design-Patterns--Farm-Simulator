/**
 * CropFarmFactory.java
 * <p>
 * Crop Farm Factory abstract class for creation of all crop farms and their methods.
 *
 * @author Samantha Halliburton
 * @version 1.0.0
 */

package main.java.Factory;

/*
 * Crop Farm Factory will produce Crop Farms.
 */
public class CropFarmFactory extends FarmFactory {

    @Override
    public Farm createNewFarm() {

        return new CropFarm();

    }

}
