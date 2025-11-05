package com.pluralsight.finance;

public class Gold extends FixedAsset {
    double weight;

    public Gold(String name, Double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

}
