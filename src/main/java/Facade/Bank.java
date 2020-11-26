package main.java.Facade;

import main.java.Factory.FarmFactory;

public class Bank {
    int farmCurrency;
    FarmFactory farmFactory;

    /**
     * Bank constructor.
     * @param farmFactory farmFactory
     */
    public Bank(FarmFactory farmFactory) {
        farmCurrency = 0;
        this.farmFactory = farmFactory;
    }

    /**
     * addToFarmCurrency()
     * Adds to farm currency.
     * @return farmCurrency
     */
    public int addToFarmCurrency() {
        if (farmFactory.getNight() == false) {
            farmCurrency = farmFactory.getTotalCurrency() + farmFactory.getTotalCycles() * 100;
            return farmCurrency;
        } else {
            farmCurrency = farmFactory.getTotalCurrency();
            return farmCurrency;
        }
    }

}
