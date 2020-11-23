package main.java.Factory;

public class AnimalFarm implements Farm{

  @Override
  public void createFarm() {
    System.out.println("An animal farm was created.");
  }

}
