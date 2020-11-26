package main.java.Decorator;

public class FarmerMoney extends FarmerDecorator {

    public FarmerMoney(Farmer farmer) {
        super(farmer);
    }

    public String decorate() {
        return super.decorate() + decorateWithMoney();
    }

    private String decorateWithMoney() {
        return " and has an affinity for money-making.";
    }

}