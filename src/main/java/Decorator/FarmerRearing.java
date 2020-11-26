package main.java.Decorator;

public class FarmerRearing extends FarmerDecorator {

    public FarmerRearing(Farmer farmer) {
        super(farmer);
    }

    public String decorate() {
        return super.decorate() + decorateWithRearing();
    }

    private String decorateWithRearing() {
        return " and has an affinity for rearing.";
    }

}