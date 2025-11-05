package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Portfolio implements Valuable {

    String name;
    String owner;
    List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public void add(Valuable asset) {
        // add assests to a collection
        this.assets = new ArrayList<>();
        assets.add(asset);
    }

    @Override
    public double getValue() {
        double total = 0;
        for (Valuable asset : assets) {
            total += asset.getValue();
        }
        return total;
    }

    public double getMostValuable() {
        Valuable mostValuable = Collections.max(assets, Comparator.comparingDouble(Valuable::getValue));
        return mostValuable.getValue();
    }

    public double getLeastValuable() {
        Valuable leastValuable = Collections.min(assets, Comparator.comparingDouble(Valuable::getValue));
        return leastValuable.getValue();
    }

}
