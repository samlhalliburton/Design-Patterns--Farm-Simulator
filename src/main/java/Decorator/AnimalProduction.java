package main.java.Decorator;

public class AnimalProduction extends AnimalDecorator{

  public AnimalProduction(Animal animal) {
    super(animal);
  }

  public String decorate() {
    return super.decorate() + decorateWithProduction();
  }

  private String decorateWithProduction() {
    return " and has an affinity for production.";
  }

}
