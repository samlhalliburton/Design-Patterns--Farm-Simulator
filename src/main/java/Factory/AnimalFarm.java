/**
 * AnimalFarm.java
 * <p>
 * Animal Farm implementation of Farm interface.
 *
 * @author Samantha Halliburton
 * @version 1.0.0
 */

package main.java.Factory;

/*
 * Animal Farm implementation.
 */
public class AnimalFarm implements Farm {

    @Override
    public String createFarm() {
        return "An animal farm was created.";
    }

}
