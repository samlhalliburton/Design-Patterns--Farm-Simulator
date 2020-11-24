/**
 * CropFarm.java
 *
 * Crop Farm implementation of Farm interface.
 *
 * @author Samantha Halliburton
 * @version 1.0.0
 */

package main.java.Factory;

/*
 * Crop Farm implementation.
 */
public class CropFarm implements Farm{

  @Override
  public void createFarm() {
    System.out.println("A crop farm was created.");
  }

}
