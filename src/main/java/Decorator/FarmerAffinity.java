/**
 * FarmerAffinity.java
 *
 * FarmerAffinity class implements Affinity interface.
 *
 * @author Samantha Halliburton
 * @version 1.0.0
 */

package main.java.Decorator;

public class FarmerAffinity implements Affinity{


  private String name;

  public FarmerAffinity(String name) {
    this.name = name;
  }

  @Override
  public void setAffinity(String type) {
    if (type.equals("Growing") || type.equals("growing") || type.equals("GROWING")) {
      System.out.println("Has an affinity for growing.");
    } else if (type.equals("Rearing") || type.equals("rearing") || type.equals("REARING")) {
      System.out.println("Has an affinity for rearing.");
    } else if (type.equals("Money-making") || type.equals("money-making") || type.equals("MONEY-MAKING")) {
      System.out.println("Has an affinity for money-making.");
    } else {
      System.out.println("Has no affinity.");
    }
  }

}
