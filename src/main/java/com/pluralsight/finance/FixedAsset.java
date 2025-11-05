package com.pluralsight.finance;

public abstract class FixedAsset implements Valuable {
String name;
Double marketValue;

    public FixedAsset(String name, Double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
}
    @Override
    public String toString() {
        return getClass().getSimpleName() + " (" + name + ") - Value " + getValue();
    }

    public double getValue() {
        return marketValue;
    }
}
