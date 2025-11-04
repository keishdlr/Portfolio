package com.pluralsight;

public abstract class FixedAsset implements Valuable {
String name;
Double marketValue;

    public FixedAsset(String name, Double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
}

    public String getName() {
        return name;
    }

    public Double getMarketValue() {
        return marketValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarketValue(Double marketValue) {
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
