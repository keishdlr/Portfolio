package com.pluralsight.finance;

public class Jewelry extends FixedAsset {
    double karat;

    public Jewelry(String name, Double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        marketValue = karat * 1000;

        return marketValue;
    }
}
