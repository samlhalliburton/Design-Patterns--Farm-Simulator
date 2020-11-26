package main.java.Decorator;

public class AnimalSize extends AnimalDecorator {

    public AnimalSize(Animal animal) {
        super(animal);
    }

    public String decorate() {
        return super.decorate() + decorateWithSize();
    }

    private String decorateWithSize() {
        return " and has an affinity for size.";
    }

}
