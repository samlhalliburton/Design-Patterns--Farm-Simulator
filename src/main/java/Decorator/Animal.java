package main.java.Decorator;

public class Animal {

  public String species;
  public int size = 1;
  public int age = 0;
  public String product;

  public Animal(String species, int size, int age, String product) {
    this.species = species;
    this.size = size;
    this.age = age;
    this.product = product;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void addToAge(Animal animal) {
    age += 1;
  }
}