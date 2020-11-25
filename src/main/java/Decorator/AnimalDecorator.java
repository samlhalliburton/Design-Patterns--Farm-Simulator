package main.java.Decorator;

public abstract class AnimalDecorator implements Animal{
  private Animal animal;

  public AnimalDecorator(Animal animal) {
    this.animal = animal;
  }

  @Override
  public String decorate() {
    return animal.decorate();
  }

}
