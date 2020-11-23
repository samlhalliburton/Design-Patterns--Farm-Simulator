package main.java.Factory;

public class CropFarm implements Farm{

  @Override
  public void createFarm() {
    System.out.println("A crop farm was created.");
  }

}
