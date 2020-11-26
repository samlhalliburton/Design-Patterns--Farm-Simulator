package main.java.Decorator;

public class AnimalImpl implements Animal {
    public int totalCurrency = 0;

    @Override
    public String decorate() {
        return "An animal was created";
    }

}
