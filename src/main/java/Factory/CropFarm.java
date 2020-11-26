/**
 * CropFarm.java
 * <p>
 * Crop Farm implementation of Farm interface.
 *
 * @author Samantha Halliburton
 * @version 1.0.0
 */

package main.java.Factory;

/*
 * Crop Farm implementation.
 */
public class CropFarm implements Farm {

    @Override
    public String createFarm() {
        return "A crop farm was created.";
    }

}
