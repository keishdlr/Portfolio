package com.pluralsight.finance;

public class House extends FixedAsset {
    int yearBuilt;
    int squareFeet;
    int bedrooms;

    public House(String name, Double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {

        double m = (double) (squareFeet * 350);
        marketValue = m + (bedrooms * 500);

        return marketValue;
    }
}
