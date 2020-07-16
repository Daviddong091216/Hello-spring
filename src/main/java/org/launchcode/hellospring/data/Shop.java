package org.launchcode.hellospring.data;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private ArrayList<Flavor> coffeeOptions;

    public Shop(String name, ArrayList<Flavor> coffeeOptions) {
        this.name = name;
        this.coffeeOptions = coffeeOptions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Flavor> getCoffeeOptions() {
        return coffeeOptions;
    }

    public void setCoffeeOptions(ArrayList<Flavor> coffeeOptions) {
        this.coffeeOptions = coffeeOptions;
    }


}
