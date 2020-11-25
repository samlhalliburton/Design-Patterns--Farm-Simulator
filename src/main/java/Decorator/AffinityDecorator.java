/**
 * AffinityDecorator.java
 *
 * AffinityDecorator implements Affinity interface for creation of affinities.
 *
 * @author Samantha Halliburton
 * @version 1.0.0
 */

package main.java.Decorator;

public class AffinityDecorator implements Affinity{

  private Affinity wrappee;

  public AffinityDecorator(Affinity wrappee) {
    this.wrappee = wrappee;
  }

  @Override
  public void setAffinity(String type) {
    if (type.equals("Production") || type.equals("production") || type.equals("PRODUCTION")) {
      System.out.println("Has an affinity for production.");
    } else if (type.equals("Speed") || type.equals("speed") || type.equals("SPEED")) {
      System.out.println("Has an affinity for speed.");
    } else if (type.equals("Size") || type.equals("size") || type.equals("SIZE")) {
      System.out.println("Has an affinity for size.");
    } else {
      System.out.println("Has no affinity.");
    }
  }

}
