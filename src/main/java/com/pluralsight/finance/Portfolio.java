package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Portfolio {

    String name;
    String owner;
    List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public static void add() {
    // add all of the assest to a collection
        List<Person> Family = new ArrayList<Person>();

        Family.add(new Person("Elena", "Marquez"));
        Family.add(new Person("Darius", "Nguyen"));
        Family.add(new Person("Zuri", "Patel"));
        Family.add(new Person("Nova", "Kim"));
        Family.add(new Person("Kai", "Thompson"));
        Family.add(new Person("Luna", "Marquez"));
        Family.add(new Person("Orion", "Patel"));
        Family.add(new Person("Milo", "Patel"));

    }

    @Override
    public double getValue() {
       total = Collections.addAll(assets);
        return total;
    }

    public double getMostValuable() {
        hghestValue = Collections.max(assets);
        return highestValue ;
    }

    public double getLeastValuable() {
       leastValue = Collections.min(assets);
        return leastValue;
    }

}
