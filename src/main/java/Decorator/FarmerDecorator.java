package main.java.Decorator;

public abstract class FarmerDecorator implements Farmer {
    private Farmer farmer;

    public FarmerDecorator(Farmer farmer) {
        this.farmer = farmer;
    }

    @Override
    public String decorate() {
        return farmer.decorate();
    }

}

