package main.java.Decorator;

public class AnimalSpeed extends AnimalDecorator {

    public AnimalSpeed(Animal animal) {
        super(animal);
    }

    public String decorate() {
        return super.decorate() + decorateWithSpeed();
    }

    private String decorateWithSpeed() {
        return " and has an affinity for speed.";
    }

}
