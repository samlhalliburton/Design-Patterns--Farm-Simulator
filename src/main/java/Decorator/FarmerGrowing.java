package main.java.Decorator;

public class FarmerGrowing extends FarmerDecorator{

  public FarmerGrowing(Farmer farmer) {
    super(farmer);
  }

  public String decorate() {
    return super.decorate() + decorateWithGrowing();
  }

  private String decorateWithGrowing() {
    return " and has an affinity for growing.";
  }

}
